public class LineSeg {
  private MyPoint pointA;
  private MyPoint pointB;
  public LineSeg(MyPoint pointA, MyPoint pointB) {
    this.pointA = pointA;
    this.pointB = pointB;
  }
  public double cross(MyPoint pointO, MyPoint pointA, MyPoint pointB) {
      return (pointA.getX() - pointO.getX()) * (pointB.getY() - pointO.getY()) - (pointA.getY() - pointO.getY()) * (pointB.getX() - pointO.getX());
  }
  public boolean intersection(LineSeg line) {
    if(Math.min(this.pointA.getX(), this.pointB.getX()) <= Math.max(line.pointA.getX(), line.pointB.getX()) && Math.min(line.pointA.getX(), line.pointB.getX()) <= Math.max(this.pointA.getX(), this.pointB.getX()) && Math.min(this.pointA.getY(), this.pointB.getY()) <= Math.max(line.pointA.getY(), line.pointB.getY()) && Math.min(line.pointA.getY(), line.pointB.getY()) <= Math.max(this.pointA.getY(), this.pointB.getY())) {
      if(cross(this.pointA, this.pointB, line.pointA) * cross(this.pointA, this.pointB, line.pointB) < 0 && cross(line.pointA, line.pointB, this.pointA) * cross(line.pointA, line.pointB, this.pointB) < 0 ) {
          return true;
      }
      else  {
          return false;
      }
    }
    else {
        return false;
    }
  }
  public void display() {
      System.out.printf("(%.1f,%.1f)---(%.1f,%.1f)\n", pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY());
  }

  public MyPoint getPointA() {
    return pointA;
  }
  public MyPoint getPointB() {
    return pointB;
  }
  public double getDistance(MyPoint point) {
    double Ax = pointA.getX();
    double Ay = pointA.getY();
    double Bx = pointB.getX();
    double By = pointB.getY();
    double Px = point.getX();
    double Py = point.getY();
    double ABx = Bx - Ax;
    double ABy = By - Ay;
    double APx = Px - Ax;
    double APy = Py - Ay;
    double ABlen2 = ABx * ABx + ABy * ABy;
    if (ABlen2 == 0) {
        return Math.sqrt(APx * APx + APy * APy);
    }
    double t = (APx * ABx + APy * ABy) / ABlen2;
    t = Math.max(0, Math.min(1, t));
    double projectionX = Ax + t * ABx;
    double projectionY = Ay + t * ABy;
    double dx = Px - projectionX;
    double dy = Py - projectionY;
    return Math.sqrt(dx * dx + dy * dy);
  }
}
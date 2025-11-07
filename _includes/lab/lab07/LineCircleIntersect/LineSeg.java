public class LineSeg {
  private MyPoint pointA;
  private MyPoint pointB;
  public LineSeg(MyPoint pointA, MyPoint pointB) {
    this.pointA = pointA;
    this.pointB = pointB;
  }
  public double intersection(LingSeg line) {
    if(Math.min(this.pointA.getX(), this.pointB.getX()) <= Math.max(line.pointA.getX(), line.pointB.getX()) && Math.min(line.pointA.getX(), line.pointB.getX()) <= Math.max(this.pointA.getX(), this.pointB.getX()) && Math.min(this.pointA.getY(), this.pointB.getY()) <= Math.max(line.pointA.getY(), line.pointB.getY()) && Math.min(line.pointA.getY(), line.pointB.getY()) <= Math.max(this.pointA.getY(), this.pointB.getY())) {
      if(((this.pointB.getX() - this.pointA.getX()) * (line.pointA.getY() - this.pointA.getY()) * (line.pointA.getX() - this.pointA.getX)) * (line.pointA.getY() - this.pointA.getY()) * (this.pointB.getY() - this.pointA.getY()))
    }
  }
}
public class MyPoint {
  private double x;
  private double y;
  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public void display() {
    System.out.printf(getIofo());
  }
  public void getInfo() {
    return String.format("(%.1f,%.1f)", x, y);
  }
  public void getX() {
    return x;
  }
  public void getY() {
    return y;
  }
  public void move(double x, double y) {
    this.x = this.x + x;
    this.y = this.y + y;
  }
  public double getDistance(MyPoint center) {
    return Math.sqrt(Math.pow((center.x - this.x), 2 + Math.pow(center.y - this.y), 2);
  }
}
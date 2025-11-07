public class MyPoint {
  private double x;
  private double y;
  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public void display() {
    System.out.printf(getInfo());
  }
  public String getInfo() {
    return String.format("(%.1f,%.1f)\n", x, y);
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public void move(double x, double y) {
    this.x = this.x + x;
    this.y = this.y + y;
  }
  public double getDistance(MyPoint point) {
    return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
  }
}
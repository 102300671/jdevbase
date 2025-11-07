public class MyCircle {
  private MyPoint point;
  private double radius;
  public MyCircle(MyPoint point, double radius) {
    this.point = point;
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }
  public double getArea() {
    return 3.14 * radius * radius;
  }
}
public class MyCircle {
  private double x;
  private double y;
  private double r;
  public MyCircle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }
  public double getArea() {
    return 3.14 * r * r;
  }
  public void display() {
    System.out.printf("Circle Center:(%.1f,%.1f),radius=%.1f,Area=%.1f\n", x, y, r, getArea());
  } 
}
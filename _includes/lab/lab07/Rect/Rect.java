public class Rect {
  double side1;
  double side2;
  public Rect() {
    this.side1 = side1;
    this.side2 = side2;
  }
  public double getArea() {
    return side1 * side2;
  }
  public double getPerimeter() {
    return 2 * (side1 + side2);
  }
  public static double getArea(int a, int b) {
    return a * b;
  }
  public static double getPerimeter(int a, int b) {
    return 2 * (a + b);
  }
}
public class Test3 {
    public static void main(String[] args) {
        Circle c0 = new Circle();
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(10);
        System.out.println(c0.getArea());
        System.out.println(c0.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
    }
}
//这里定义Circle类
class Circle {
  int r;
  public Circle() {
    this.r = 0;
  }
  public Circle(int r) {
    this.r = r;
  }
  public double getArea() {
    return 3.14 * r * r;
  }
  public double getPerimeter() {
    return 2 * 3.14 * r;
  }
}
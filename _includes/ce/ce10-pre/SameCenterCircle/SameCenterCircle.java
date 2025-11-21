public class SameCenterCircle {
  private static double x;
  private static double y;
  private double radius;
  public SameCenterCircle(double radius) {
    this.radius = radius;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public double getRadius() {
    return radius;
  }
  public static double getArea(double r) {
    return 3.14 * r *r;
  }
  public void display() {
    System.out.printf("[%.1f,%.1f],radius=%.1f,area=%.1f%n", getX(), getY(), getRadius(), getArea(radius));
  }
  public static void main(String[] args) {

  SameCenterCircle.x=3;SameCenterCircle.y=4;

  SameCenterCircle c1 = new SameCenterCircle(10);

  SameCenterCircle c2 = new SameCenterCircle(100);

  c1.display();

  c2.display();

  SameCenterCircle.x=5;SameCenterCircle.y=6;

  c1.display();

  c2.display();

  System.out.println(SameCenterCircle.getArea(5));

}
}
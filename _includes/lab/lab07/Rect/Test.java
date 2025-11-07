import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    Rect r = new Rect();

    r.side1 = sin.nextDouble();
    r.side2 = sin.nextDouble();

    System.out.println("area is:"+r.getArea());
    System.out.println("perimeter is:"+r.getPerimeter());
    System.out.println(Rect.getArea(3, 5));
    System.out.println(Rect.getPerimeter(3, 5));
  }
}
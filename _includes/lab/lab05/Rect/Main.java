import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    Rect r = new Rect();
    r.side1 = sin.nextDouble();
    r.side2 = sin.nextDouble();
    
    System.out.println("area is:"+r.getArea());
    System.out.println("perimeter is:"+r.getPerimeter());
  }
}
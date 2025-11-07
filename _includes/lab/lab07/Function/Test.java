import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    int x, y, z;
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
    in.close();

    Function function = new Function();
    int result;
    if (x < 0) {
        result = function.f();
    } else if (x >= 0 && y < 0) {
        result = function.f(x);
    } else if (x >= 0 && y >= 0 && z < 0) {
        result = function.f(x, y);
    } else {
        result = function.f(x, y, z);
    }
    System.out.println(result);
  }
}
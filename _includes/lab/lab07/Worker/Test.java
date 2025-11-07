import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int baodi = sc.nextInt();
    int gongshi = sc.nextInt();
    int danjia = sc.nextInt();
    int guding = sc.nextInt();
    Worker worker = new Worker();
    System.out.println("way1:" + worker.way(baodi, gongshi, danjia));
    System.out.println("way2:" + worker.way(guding));
  }
}
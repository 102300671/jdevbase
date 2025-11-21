public class Test {
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
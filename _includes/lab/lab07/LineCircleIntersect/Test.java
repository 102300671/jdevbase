public class Test {
  public static void main(String[] args) {
    double r = 50;
    MyPoint center = new MyPoint(100,100);
    MyCircle circle = new MyCircle(center, r);
    LineSeg line1 = new LineSeg(new MyPoint(0,100), new MyPoint(100,200));
    LineSeg line2 = new LineSeg(new MyPoint(0,0), new MyPoint(100,100));             
    line1.display();
    circle.display();
    System.out.println("line1&circle intersection: "+circle.intersection(line1));             
    System.out.println("---------------------------");
    line2.display();
    circle.display();
    System.out.println("line2&circle intersection: "+circle.intersection(line2));
    System.out.println("---------------------------");
    while(circle.intersection(line2)) {
      circle.move(10,10);
      circle.getCenter().display();
    }
    circle.display();
    System.out.println("line2&newCircle intersection: "+circle.intersection(line2));      
    System.out.println("---------------------------");
  }
}
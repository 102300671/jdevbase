public class Test{
  public static void main(String[] args) {
    int size = 5;
    double[] radius = {10.0,5.0,7.0,9.0,15.0};
    MyPoint point;
    point = new MyPoint(10.0,20.0);
    for (int i=0;i<size;i++ ){
      System.out.println("radius "+i+": "+radius[i]);
    }
    ConcentricCircles cc = new ConcentricCircles(size, point);
    cc.createCircles(radius);
    cc.sort();
    cc.display();
  }
}
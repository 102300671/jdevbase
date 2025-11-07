import java.text.DecimalFormat;

public class ConcentricCircles {
  private MyPoint point;
  private MyCircle[] circles;
  private int size;
  DecimalFormat df = new DecimalFormat("0.0##");
  public ConcentricCircles(int size, MyPoint point) {
    this.size = size;
    this.point = point;
    this.circles = new MyCircle[size];
  }
  public void createCircles(double[] radius) {
    for(int i = 0; i < size; i++) {
      circles[i] = new MyCircle(point, radius[i]);
    }
  }
  public void sort() {
    for(int i = 0; i < size - 1; i++) {
      for(int j = 0; j < size - 1; j++) {
        if(circles[j].getArea() > circles[j + 1].getArea()) {
          MyCircle temp = circles[j];
          circles[j] = circles[j + 1];
          circles[j + 1] = temp;
        }
      }
    }
  }
  public void display() {
    for(int i = 0; i < size; i++) {
      System.out.printf("Circle Center:(%.1f,%.1f),radius=%.1f,Area=%s\n", point.getX(), point.getY(), circles[i].getRadius(), df.format(circles[i].getArea()));
    }
  }
}
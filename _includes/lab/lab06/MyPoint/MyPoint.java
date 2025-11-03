public class MyPoint {
   private double x;
   private double y;
   public MyPoint(double x, double y) {
     this.x = x;
     this.y = y;
   }
   public String getInfo() {
     return String.format("(%.1f,%.1f)",x, y);
   }
   public void display() {
     System.out.println(getInfo());
   }
}
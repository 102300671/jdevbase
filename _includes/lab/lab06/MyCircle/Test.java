public class Test {
  public static void main(String[] args) {
    MyCircle circle;
    for (int i=0;i<5;i++ ){
      circle = new MyCircle(10.0,20.0,(i+1)*10);
      circle.display();
    }
  }
}


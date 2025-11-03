public class Test {
	public static void main(String[] args) 	{
		MyPoint point;
		for (int i=0;i<5;i++ ){
			point = new MyPoint(i*10.0,20.0);
			point.display();
		}
	}
}


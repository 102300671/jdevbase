public class Graduate extends Student {
	private String major;
	public Graduate(String name, int studentNumber, String major) {
		super(name, studentNumber);
		this.major = major;
	}
	public void display() {
		super.display();
		System.out.printf("Major: %s%n", major);
	}
}
public class Undergraduate extends Student {
	private int grade;
	public Undergraduate(String name, int studentNumber, int grade) {
		super(name, studentNumber);
		this.grade = grade;
	}
	public void display() {
		super.display();
		System.out.printf("Grade: %d%n", grade);
	}
}
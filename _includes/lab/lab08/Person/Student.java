public class Student extends Person {
	private int studentNumber;
	public Student(String name, int studentNumber) {
		super(name);
		this.studentNumber = studentNumber;
	}
	public void display() {
		super.display();
		System.out.printf("StudentNumber: %d%n", studentNumber);
	}
}
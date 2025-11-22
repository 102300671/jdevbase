public class Teacher extends Person {
	private String  professionalTitle;
	public Teacher(String name, String professionalTitle) {
		super(name);
		this.professionalTitle = professionalTitle;
	}
	public void display() {
		super.display();
		System.out.printf("Professional Title: %s%n", professionalTitle);
	}
}
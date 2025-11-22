public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void display() {
		System.out.printf("Name: %s%n", name);
	}
}
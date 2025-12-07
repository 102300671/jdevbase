package lab.lab09.Person;

public abstract class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public abstract void speak();
	public String getName() {
		return name;
	}
}
package lab.lab09.Person;

public class Main {
	public static void main(String[] args) {

		Person p1 = new Teacher("Mr wang");

		p1.speak();

		p1 = new Worker("Worker zhang");

		p1.speak();

		}
}

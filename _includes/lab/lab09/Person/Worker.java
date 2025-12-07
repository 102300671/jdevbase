package lab.lab09.Person;

public class Worker extends Person {

	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " said to have a rest!");
	}

}

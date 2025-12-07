package lab.lab09.Person;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " said class is over!");
	}

}

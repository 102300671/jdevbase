package lab.lab09.PersonInterface;

public class Teacher extends Person implements Movable, Soundable {

	public Teacher() {
		setName("Mr. Wang");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " walks on the platform!");
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is in class!");
	}

}

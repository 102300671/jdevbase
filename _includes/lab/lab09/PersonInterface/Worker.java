package lab.lab09.PersonInterface;

public class Worker extends Person implements Soundable, Movable {

	public Worker() {
		setName("Zhang Gong");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " walks around the workshop!");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("The noise is too loud to hear clearly.");
	}

}

package lab.lab08.Animal;

public class Fish extends Food {
	public Fish(int weight) {
		super(weight);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

package lab.lab08.Animal;

public class Bone extends Food {
	public Bone(int weight) {
		super(weight);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

package lab.lab08.Animal;

public class Dog extends Animal {
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	@Override
	public void eat(Food food) {
		super.eat(food);
		System.out.printf("Dog like %s%n", food);
	}
}

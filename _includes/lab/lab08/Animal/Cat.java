package lab.lab08.Animal;

public class Cat extends Animal {
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	@Override
	public void eat(Food food) {
		super.eat(food);
		System.out.printf("Cat like %s%n", food);
	}
}

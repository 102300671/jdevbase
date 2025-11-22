package lab.lab08.Animal;

public class Test{

    public static void main(String[] args) {

        Feeder fd = new Feeder("Tom");

        Dog dog = new Dog();

        Bone bone = new Bone(500);

        fd.feed(dog, bone);

        System.out.println("-----------------");

        fd.feed(new Cat(), new Fish(100));

    }

}

class Feeder {

    private String name;

    public Feeder(String name) {

        this.name = name;

    }   

    public void feed(Animal a, Food f) {

        a.eat(f);

        System.out.println("Feeder "+name+" feed "+a+ " with "+f.getWeight()+"g "+f+".");

    }   

}

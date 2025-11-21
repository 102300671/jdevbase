class Animal {
    private String name;
    
    public Animal(String name) {
        super();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String speak() {
        return "...";
    }
}
//Dog类是Animal的子类
class Dog extends Animal
 {
    //Dog的构造方法
      public Dog(String name) {
        super(name);
      }
    }

    //Dog重写Animal的speak方法
    @Override
    public String speak() {
      return "wang wang...";
    }

    
}

//Cat类是Animal的子类
class Cat extends Animal
 {
    //Cat的构造方法
    public Cat(String name) {
      super(name);
    }

    //Cat重写Animal的speak方法
    @Override
    public String speak() {
      return "miao miao...";
    }

    
}
class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }
    
    public void feed(Animal d) {
        System.out.println(name+" fed "+d.getName()+","+d.getName()+" spoke happily:"+d.speak());
    }
}
public class Test {
    public static void main(String[] args) {
        Person p = new Person("Mary");
        Dog ah = new Dog("Jeffy");
        Cat xh = new Cat("Tom");
        p.feed(ah);
        p.feed(xh);
    }
}







控制台

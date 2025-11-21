public class Test{
    public static void main(String[] args) 
    {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        Person p3 = new Person("李四", 20);
        Person p4 = new Person("张三", 21);
        Animal a = new Animal();
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(a));
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
      if(this == obj) return true;
      if(obj == null || getClass() != obj.getClass()) return false;
      Person other = (Person) obj;
      if(age != other.age) return false;
      if(name == null) {
        return other.name == null;
      } else {
        return name.equals(other.name);
      }

    }
}

class Animal {
    private String name;

    public Animal() {
        super();
    }
}
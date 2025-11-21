class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name=" + name);
    }
}
//这里编写Teacher类
class Teacher extends Person {
  private int salary;
  public Teacher(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
  }
}

public class Test {

    public static void main(String[] args) {
        Teacher zhang=new Teacher("zhang", 40, 4580);
        zhang.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //这里填写Person类中必要的代码
    
    public Person(String name) {
      this.name = name;
    }
    
    public Person() {
      
    }


    public void display(){
        System.out.println("Name=" + name);
    }
}
//这里设计Teacher类
class Teacher extends Person {
  private int salary;
  public Teacher(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
  }
  public Teacher(String name) {
    super(name);
  }
  public Teacher() {
    super();
  }
}

public class Test {
    public static void main(String[] args) {
        Teacher zhang=new Teacher("zhang", 40, 4580);
        Teacher wang = new Teacher("wang");
        Teacher wms = new Teacher();
        zhang.display();
        wang.display();
       wms.display();
    }
}
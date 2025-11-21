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
class Student extends Person {
    private double grade;

    public Student(String name,int age,double grade) {
        super(name,age);
        this.grade = grade;
    }
    @Override
    public void display() {
      super.display();
      System.out.printf("Grade=%.1f%n", grade);
    }


}
public class Test {

    public static void main(String[] args) {
        Student s = new Student("lisi",23,86);
        s.display();
    }
}
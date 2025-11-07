public class Test{
    public static void main(String [] args){
        Student s1 = new Student("zhang", 23, 74);
        s1.display();
        Student s2 = new Student("lisi", 20, 65);
        s2.display();
        Student s3 = new Student("wang", 21, 93);
        s3.display();
    }
}

class Student{
    private String name="";
    private int age=0;
    private double grade=0;
    private static int counter = 0;

    
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        counter ++;
    }
    
    public void display(){
        System.out.println("Instance order=" + counter + " Name=" + name);
    }
}
public class Test2{
    public static void main(String [] args){
        Teacher t = new Teacher("Mr.Wang",35);
        t.display();
    }
}
class Teacher{
    String name = "Mr.Zhang";
    int age = 30;
    //添加构造方法
    public Teacher(String name, int age) {
      this.name = name;
      this.age = age;
    }
    public void display(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
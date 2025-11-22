package ce.ce07;
public class Test2{
    public static void main(String [] args){
        Teacher2 t = new Teacher2("Mr.Wang",35);
        t.display();
    }
}
class Teacher2{
    String name = "Mr.Zhang";
    int age = 30;
    //添加构造方法
    public Teacher2(String name, int age) {
      this.name = name;
      this.age = age;
    }
    public void display(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
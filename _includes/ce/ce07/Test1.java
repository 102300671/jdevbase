class Teacher{
        //属性区
        String name = "Mr.Zhang";
        int age = 30;
        //display()方法
        public void display() {
          System.out.printf("name:%s\nage:%d\n",name,age);
        }
}
public class Test1{
    public static void main(String[] args) {
      //创建Teacher类的对象并调用display()方法
        Teacher t = new Teacher();
        t.display();
    }
}
class Student {
    private String name ;
    private int age ; 
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这里定义两个学生年龄比较的方法
    public int compareWithAge(Student student) {
      return this.age - student.age;
    }

}
public class TestStudent {
    public static void main(String[] args) {
        Student zhangsan = new Student("张三",20);
        Student lisi = new Student("李四",21);
        //比较张三和李四的年龄，输出年龄差
        int x = zhangsan.compareWithAge(lisi);
        System.out.println(x);
    }
}

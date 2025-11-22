package ce.ce08;

class Student {
    private String name ;
    private int age ; 
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //定义两个学生相等的方法,姓名和年龄都相等，则相等
    @Override
    public boolean equals(Object obj) {
      if(this == obj) return true;
      if(obj == null || this.getClass() != obj.getClass()) return false;
      Student student = (Student) obj;
      return this.age == student.age && this.name.equals(student.name);
    }
    
    @Override
    public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + age;
      return result;
    }

}
public class TestStudentE {
    public static void main(String[] args) {
        Student zhangsan = new Student("张三",20);
        Student lisi = new Student("李四",21);
        Student wangwu = new Student("张三",20);
        //比较zhangsan和lisi,得到比较结果
        boolean result1 = zhangsan.equals(lisi);
        //比较zhangsan和wangwu,得到比较结果
        boolean result2 = zhangsan.equals(wangwu);
        //输出
        System.out.println(result1);
        System.out.println(result2);
    }
}
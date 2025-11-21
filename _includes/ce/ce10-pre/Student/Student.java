public class Student {
  private static String year;
  private String name;
  private int age;
  public Student(String name) {
    this.name = name;
  }
  public static void setYear(String year) {
    Student.year = year;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getYear() {
    return year;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public void display() {
    System.out.printf("%s started school in %s\n", getName(), getYear());
  }
}
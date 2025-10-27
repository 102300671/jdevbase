public class Worker  {
  String name;
  int age;
  double salary;
  String level;
  public Worker(String name, int age, double salary, String level) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.level = level;
  }
  public void display() {
    System.out.printf("name:%s\nage:%d\nsalary:%.1f\nlevel:%s\n", name, age, salary, level);
  }
}
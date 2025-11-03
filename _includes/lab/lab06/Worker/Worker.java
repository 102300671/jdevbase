public class Worker {
  private String name;
  private int age;
  private double salary;
  private String level;
  public Worker() {
  }
  public Worker(String name, int age, double salary, String level) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.level = level;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public double getSalary() {
    return salary;
  }
  public void setLevel(String level) {
    this.level = level;
  }
  public String getLevel() {
    return level;
  }
  public void display() {
    System.out.printf("name=%s\nage=%d\nsalary=%.1f\nlevel=%s\n", name, age, salary, level);
  }
}
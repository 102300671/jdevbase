public class Test {
  public static void main(String[] args) {

  Student s1 = new Student("Alice");

  Student s2 = new Student("Bob");

  Student.setYear("2020");

  s1.display();

  s2.display();

  Student.setYear("2024");

  s1.display();

  s2.display();

}
}
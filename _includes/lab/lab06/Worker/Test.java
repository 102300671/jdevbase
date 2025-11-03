public class Test {
  public static void main(String[] args) {
    Worker wOne = new Worker();
    wOne.setName("Tom");
    wOne.setAge(20);
    wOne.setSalary(5000);
    wOne.setLevel("Junior");
    wOne.display();
    System.out.println("-----");
    Worker wTwo = new Worker("Jerry",30,9000,"MiddleRank");
    wTwo.display();

    wTwo.setSalary(10000);
    System.out.println("after modify,Work2 salary=" + wTwo.getSalary());
  }
}
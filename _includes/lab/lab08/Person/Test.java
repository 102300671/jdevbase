public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Tom");
        people[1] = new Teacher("Kevin","professor");
        people[2] = new Student("Jerry",21);
        people[3] = new Undergraduate("John",22,3);
        people[4] = new Graduate("Mary",23,"computer");
        for (Person p: people) {
            p.display();
            System.out.println(">>>");
        }
    }
}
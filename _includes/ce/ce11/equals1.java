public class Test{
    public static void main(String[] args) 
    {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
      if(this == obj) return true;
      if(obj == null || getClass() != obj.getClass()) return false;
      Person person = (Person) obj;
      if(name == null) {
        return person.name == null;
      } else {
        return name.equals(person.name);
      }
    }
    public int hashCode() {
      return name != null ? name.hashCode() : 0;
    }
}

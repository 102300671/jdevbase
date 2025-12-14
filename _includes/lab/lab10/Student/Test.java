package lab.lab10.Student;

public class Test

{

public static void main(String[] args)

{

StudentClass sClass = new StudentClass();

sClass.createClass();


sClass.add(new Student("Steven",18,88));



System.out.println("Original Order:");

System.out.println(sClass.output());



sClass.sort();


System.out.println("Sorted Order:");

System.out.println(sClass.output());

}

}

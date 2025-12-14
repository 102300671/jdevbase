package lab.lab10.StudentC;

public class Test

{

       public static void main(String[] args)

       {

              StudentClass sClass = new StudentClass();

              sClass.createClass();

 

              System.out.println("Original Order:");

              System.out.println(sClass.output());

 

              sClass.sort();

             

              System.out.println("Sorted Order:");

              System.out.println(sClass.output());          

       }

}

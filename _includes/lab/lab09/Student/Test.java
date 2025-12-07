package lab.lab09.Student;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        Student[] s = new Student[4];
        s[0] = new Student("May");
        s[1] = new Student("Jack");
        s[2] = new Student("Armstrong");
        s[3] = new Student("Linda");

        Arrays.sort(s);

        System.out.println("according to alphabetical order:");
        for (Student stu:s)
        {
            System.out.println(stu.getName());
        }
    }
}

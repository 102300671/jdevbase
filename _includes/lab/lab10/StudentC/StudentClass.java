package lab.lab10.StudentC;
import java.util.*;

public class StudentClass {
	List<Student> stuList = new ArrayList<Student>();
	private int size;
	public void createClass() {
		String names[] = {"Tom","Jerry","Snoopy","Mary","Rose"};
        double grades[] = {67,78.5,98,76.5,90};
        int ages[] = {17,18,18,19,17};
        size = names.length;
        for(int i = 0; i < size; i++) {
        	stuList.add(new Student(names[i], grades[i], ages[i]));
        }
	}
	public void sort() {
		StudentComparator comparator = new StudentComparator();
		Collections.sort(stuList, comparator);
	}
	public String output() {
		for(int i = 0; i < stuList.size(); i++) {
			System.out.printf("Name: %s\tGrade: %.1f%n", stuList.get(i).getName(), stuList.get(i).getGrade());
		}
		return String.format("total: %d students", stuList.size());
	}
}

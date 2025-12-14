package lab.lab10.Student;
import java.util.*;

public class StudentClass {
	List<Student> stuList = new ArrayList<Student>(); 
	public void createClass() {
		String names[] = {"Tom","Jerry","Snoopy","Mary","Rose"};
        double grades[] = {67,78.5,98,76.5,90};
        int ages[] = {17,18,18,19,17};
        for(int i = 0; i < names.length; i++) {
        	stuList.add(new Student(names[i], ages[i], grades[i]));
        }
	}
	public void sort() {
		for(int i = 0; i < stuList.size(); i++) {
			for(int j = 1; j < stuList.size(); j++) {
				if(stuList.get(j - 1).getGrade() < stuList.get(j).getGrade()) {
					Student temp = stuList.get(j - 1);
					stuList.set(j -1 , stuList.get(j));
					stuList.set(j, temp);
				}
			}
		}
	}
	public String output() {
		for(int i = 0; i < stuList.size(); i++) {
			System.out.printf("Name: %s\tGrade: %.1f%n", stuList.get(i).getName(), stuList.get(i).getGrade());
		}
		return String.format("total: %d students", stuList.size());
	}
	public void add(Student t) {
		stuList.add(t);
	}
}

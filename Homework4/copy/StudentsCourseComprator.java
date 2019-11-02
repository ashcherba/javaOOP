package Homework4.copy;

import java.util.Comparator;

public class StudentsCourseComprator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		return st1.getCourse()-st2.getCourse();
	}

}

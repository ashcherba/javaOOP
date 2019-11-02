package Homework4.copy;

import java.util.Comparator;

import Homework3.Student;

public class StudentsAgeComprator implements Comparator<Student>{
	@Override
	public int compare(Student st1, Student st2) {
	      return st1.getAge() - st2.getAge();
	}
}

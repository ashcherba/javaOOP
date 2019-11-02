package Homework4.copy;

import java.util.Comparator;

import Homework3.Student;

public class Group implements IRecruitment{
	
		private String groupName;
		private Student[] students = new Student[10];
		
		
		Group(String groupName) {
			this.students = new Student[10];
			this.groupName = groupName;
		}
		
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		
		public String getGroupName() {
			return groupName;
		}
		
		public Student[] getStudents() {
			return students;
		}
	
		public void addStudent(Student student) throws MyFirstException {
			for(int i = 0; i < students.length; i++) {
				if(students[i] == null) {
					students[i] = student;
					break;
				}	
				else if (i == 10){
					throw new MyFirstException();
				}
			}
		}
		
		public void deleteStudent(Student student) {
			for(int i = 0; i < students.length; i++) {
				if(students[i].equals(student)) {
					students[i] = null;
					System.out.println("Student " + students[i].getSurname() + " was deleted");
					break;
				}
		}
}
		
		public void searchBySurname(String surname) {
			for(int i = 0; i < students.length; i++) {
				if(students[i].getSurname() == surname) {
					return;
				}
				else if (students[i] == null || students[i].getSurname() != surname){
					System.out.println("Student" + students[i].getSurname() + " was found");
					return;
				}
			}
		}

		@Override
		public Student[] returnListOfDraftees() {
			Student[] draftees = new Student[10];
			for(int i = 0; i < students.length; i++) {
				if(students[i].getAge() >= 18) {
					draftees[i] = students[i];
					break;
				}
			}
			return draftees;
		}

}




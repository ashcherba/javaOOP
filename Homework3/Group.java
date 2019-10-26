package Homework3;

import java.util.Arrays;

public class Group {
	private String groupName;
	private Student students[] = new Student[10];
	
	
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
			else if (i == 10 || students[i] == student){
					throw new MyFirstException();
				}
			}
	}
	
	public void deleteStudent(Student student) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == student) {
				students[i] = null;
				System.out.println("Student " + students[i].getSurname() + " was deleted");
				return;
			}
			else if (students[i] != student) {
				System.out.println("Student was not found");
				return;
			}
		}
	}
	
	public void searchBy(String surname) {
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
	 public String toString() {
		String[] names = new String[10];
		for (int i = 0; i < this.students.length; i++) {
			if(this.students[i] != null) {
				names[i] = this.students[i].getName() + " " + this.students[i].getSurname();
			}
			else {
				names[i] = " ";
      	 	}
		}
		Arrays.sort(names);
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < names.length; i++) {
       	 if(!names[i].equals(" ")) {
                stringBuilder.append(names[i]);
                if (i == names.length - 1) {
                break;
                }
       	 }
       	 else {
       		 continue;
       	 }
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
	}
}

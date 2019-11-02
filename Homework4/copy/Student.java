package Homework4.copy;

public class Student extends Human {
	private String university;
	private int course;
	
	public Student(String name, String surname, int age, String university, int course) {
		super(name, surname, age);
		this.university = university;
		this.course = course;
	}
	
	public void setUniversity(String university) {
		this.university = university;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public int getCourse() {
		return course;
	}
	
	@Override
	public String recieveInformation(Human human) {
		return "Current person has name " + this.getName() + " and age " + this.getAge();
	}

}

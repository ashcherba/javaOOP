package Homework4.copy;

public class Human {

	private String name;
	private String surname;
	private int age;
	
	//Constructors:
	Human(){
		super();
	}
	
	Human(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	//Getters and Setters:
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	//Other Methods:
	public String recieveInformation(Human human) {
		return "Current person has name " + this.name + " and surname " + this.surname + " and age " + this.age;
	}
	
}

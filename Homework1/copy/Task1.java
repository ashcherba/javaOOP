package Homework1.copy;

public class Task1 {
	public static void main (String[] args) {
		Cat pet= new Cat("Bill",4,"Canin","Meeeaaw");
		pet.sayHi();
		pet.print();
		
		
		Cat newPet = new Cat("Bill",4,"Canin","Meeeaaw");
		newPet.setAge(10);
		newPet.print();
		
	}

}

class Cat {
	private String name;
	private int age;
	private String breed;
	private String voice;
	
	Cat(String name, int age, String breed, String voice) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.voice = voice;
	}
	
	public void setName (String name) {
		if (name != null) {
			this.name = name;
		}
	}
	
	public void setAge (int age) {
		if (age > 0) {
			this.age = age;
		}
	}
	
	public void setBread (String breed) {
		if (breed != null) {
			this.breed = breed;
		}
	}
	
	public void setVoice (String voice) {
		if (voice != null) {
			this.voice = voice;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getVoice() {
		return voice;
	}
	
	public void sayHi () {
		System.out.println(this.voice);
	}
	
	public void print() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}
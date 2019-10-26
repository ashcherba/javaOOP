package Homework3;

public class Main {

	public static void main(String[] args) throws MyFirstException {

		Student st1 = new Student("Vasya","Volkov",24, "KPI", 6);
		Student st2 = new Student("Aya","Volkova",20, "KPI", 3);
		Student st3 = new Student("Baya","Volk",20, "KPI", 3);
		Student st4 = new Student("Zaya","Vol",20, "KPI", 3);
		Student st5 = new Student("Galya","Vinnyk",20, "KPI", 3);
		Student st6 = new Student("Nadya","Vilnyk",20, "KPI", 3);
		Student st7 = new Student("Radya","Vinnyks",20, "KPI", 3);
		Student st8 = new Student("Zadya","Vint",20, "KPI", 3);
		Student st9 = new Student("Vadya","Vintyk",20, "KPI", 3);
		Student st10 = new Student("Gradya","Vintyks",20, "KPI", 3);
		
		Group group = new Group("first");
		
		try {
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		group.addStudent(st6);
		group.addStudent(st7);
		group.addStudent(st8);
		group.addStudent(st9);
		group.addStudent(st10);
		group.addStudent(st10); // exception when 11th element was added to array[11]
		}
		catch(MyFirstException mfe) {
			System.out.println(mfe.getMessage()); 
		}
		
		group.deleteStudent(st8);
		
		
		group.searchBy("Vol");
		
		System.out.println(group.toString());
	}

}

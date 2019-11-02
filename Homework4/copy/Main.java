package Homework4.copy;

import java.util.Scanner;

import Homework3.MyFirstException;
import Homework3.Student;

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
		Scanner scan = new Scanner(System.in);
		
	    int x = 0;
	    String s ="";
		

			while (!"4".equals(s)){
	            System.out.println("1. To Add a student to the group, enter 1");
	            System.out.println("2. To Delete a student from the group, enter 2");
	            System.out.println("3. To Search for a student by surname, enter 3");
	            System.out.println("4. To Search for a student by students age, enter 4");
	            System.out.println("5. To Search for a student by students university, enter 5");
	            System.out.println("6. To Search for a student by students course, enter 6");
	            System.out.println("7. To show list of recruitments");
	            System.out.println("8. To close an application, enter 8");
	            s = scan.next();
	                        
	            try {
	                x = Integer.parseInt(s);
	            } catch (NumberFormatException e){ 
	                System.out.println("Incorrect data");
	            }
	            
	            switch (x){
	                case 1:
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
	                		}
	                	catch(Homework4.copy.MyFirstException mfe) {
	                		System.out.println(mfe.getMessage()); 
	                		}
	                    break;
	                case 2:
	                	try {
	                    group.deleteStudent(st9);
	                	}
	                	catch (NullPointerException npe) {
	                		System.out.println(npe.getMessage());
	                	}
	                    break;
	                case 3:
	                    group.searchBySurname(st1.getSurname());
	                    break;
	                case 4:
	                	new StudentsAgeComprator();
	                    for (Student stud : group.getStudents()) {
	                        System.out.println(stud);
	                    }
	                    break;
	                case 5:
	                	new StudentsUniversityComprator();
	                    for (Student stud : group.getStudents()) {
	                        System.out.println(stud);
	                    }
	                    break;
	                case 6:
	                	new StudentsCourseComprator();
	                    for (Student stud : group.getStudents()) {
	                        System.out.println(stud);
	                    }
	                    break;
	                case 7:
	                    System.out.println(group.returnListOfDraftees());
	                    break;
	            }
	        System.out.println("Good buy!");
			}
		}
	
}

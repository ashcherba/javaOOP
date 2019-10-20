package Homework1.copy;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle1 = new Triangle(5,5,5);
		triangle1.areaTriangle();
	}

}

class Triangle {
	private double a;
	private double b;
	private double c;
	
	Triangle (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void areaTriangle() {
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			double perimeter = (this.a + this.b + this.c)/2;
			double area = Math.sqrt((perimeter*(perimeter-this.a)*(perimeter-this.b)*(perimeter-this.c)));
			System.out.println("Area equals " + area);
		}
		else {
			System.out.println("Area of Triangle cannot be counted");
		}
	}
}

package Homework2.copy;

public class Rectangle extends Shape{
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	Rectangle() {
		
	}
	
	Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double returnLength() {
		return Point.calculationDistance(a, b);
	}
	
	public double returnWidth() {
		return Point.calculationDistance(c, d);
	}
	
	@Override
	public String toString() {
		return "Rectangle: { " + "a= " + a + "b= " + b + "c= " + c + "d= " + d + " }";
	}

	@Override
	double getPerimetr() {
		return 2*(returnWidth() + returnLength());
	}

	@Override
	double getArea() {
		return returnWidth() * returnLength();
	}

}

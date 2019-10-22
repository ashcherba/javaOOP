package Homework2.copy;

public class Triangle extends Shape{
	private Point a;
	private Point b;
	private Point c;
	
	Triangle() {
		
	}
	
	Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA(Point a) {
		this.a = a;
	}
	
	public Point getA() {
		return a;
	}
	
	public void setB(Point b) {
		this.b = b;
	}
	
	public Point getB() {
		return b;
	}
	
	public void setC(Point c) {
		this.c = c;
	}
	
	public Point getC() {
		return c;
	}
	
	@Override
	public String toString() {
		return "Triangle: { " + "a= " + this.a + " b= " + this.b + " c= " + this.c + " }";
	}
	
	@Override
	double getPerimetr() {
		return Point.calculationDistance(a,b)+Point.calculationDistance(a,c)+Point.calculationDistance(c,b);
	}

	@Override
	double getArea() {
		double perimeter =  this.getPerimetr()/2;
		return Math.sqrt((perimeter*(perimeter-Point.calculationDistance(a,b))*(perimeter-Point.calculationDistance(a,c))*(perimeter-Point.calculationDistance(c,b))));
	}

}

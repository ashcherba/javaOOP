package Homework2.copy;

public class Circle extends Shape{

	private Point o;
	private Point x;
	
	Circle(){
		
	}
	
	Circle(Point o, Point r){
		this.o = o;
		this.x = r;
	}
	
	public void setO(Point o) {
		this.o = o;
	}
	
	public Point getO() {
		return o;
	}
	
	public void setR(Point r) {
		this.x = r;
	}
	
	public Point getR() {
		return x;
	}
	
	@Override
	public String toString() {
		return "Circle: { " + "o= " + o + " x= " + x + " }";
	}

	@Override
	double getPerimetr() {
		return 2*Math.PI*returnRadius();
	}

	@Override
	double getArea() {
		return Math.PI*returnRadius()*returnRadius();
	}
	
	public double returnRadius() {
		return Point.calculationDistance(o, x);
	}
	
}

package Homework2.copy;

public class Point{

	private double x;
	private double y;
	
	Point(){
		
	}
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "Point: {" + " x=" + this.x + ", y=" + this.y + "}";
	}
	
    public static double calculationDistance(Point a, Point b){
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
}

package Homework1.copy;

public class Task3 {

	public static void main(String[] args) {
		Vector3d vector = new Vector3d (1.0,2.0,3.0);
		Vector3d vector1 = new Vector3d (4.0,5.0,6.0);
		Vector3d vector2 = vector.add(vector1);
		System.out.println(vector2.getX());
		System.out.println(vector2.getY());
		System.out.println(vector2.getZ());
	}

}

class Vector3d {
	private double x;
	private double y;
	private double z;
	
	Vector3d (double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	Vector3d add(Vector3d vectorNew) {
		return new Vector3d(x+vectorNew.x, y+vectorNew.y, z+vectorNew.z);
	}
	
}

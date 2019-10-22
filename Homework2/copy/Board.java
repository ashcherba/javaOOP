package Homework2.copy;

public class Board {

	private Shape[] shapes = new Shape[4];
	
	Board() {
		
	}
	
	public Shape[] getShape() {
		return shapes;
	}
	
	public void addShapesToBoard(Shape shape, int boardArea) {
		if ((boardArea > 0) && (boardArea <5)) {
			if(shapes[boardArea-1] == null) {
				shapes[boardArea-1] = shape;
				System.out.println("Shape " + shape + " was added to the board");
			}
			else {
				System.out.println("Shape cannot be added. Current board area booked");
			}
		}
		else {
			System.out.println("Area is incorrect. Please, enter a number from 1 to 4");
		}
	}
	
	public void deleteFromBoard(Shape shape, int boardArea) {
		if ((boardArea > 0) && (boardArea <5)) {
			if(shapes[boardArea-1] != null) {
				shapes[boardArea-1] = shape;
				System.out.println("Shape " + shape + " was removed from the board");
			}
			else {
				System.out.println("Shape cannot be dleted. Current board area is empty");
			}
		}
		else {
			System.out.println("Area is incorrect. Please, enter a number from 1 to 4");
		}
	}
	
	public void showInfo() {
		double totalArea = 0;
		for(int i = 0; i < 4; i++) {
			if(shapes[i] != null) {
				System.out.println("Shape " + shapes[i] + " is on this part of the table");
				totalArea += shapes[i].getArea();
			}
			else {
				System.out.println("This board area is empty");
			}
		}
		System.out.println("Total area of all shapes from the board equals " + totalArea);
	}
	
}

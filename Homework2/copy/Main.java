package Homework2.copy;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0,0);
		Point b = new Point(1,4);
		Point c = new Point(3,1);
		Triangle tr = new Triangle(a,b,c);
		
        System.out.println(tr);
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimetr());
        
        Circle circle = new Circle (new Point(0,0), new Point(2,4));
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());
        
        Rectangle rect = new Rectangle(new Point(0,0), new Point(0,2), new Point(4,0), new Point(4,2));
        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimetr());
        
        
        Board board = new Board();
        board.addShapesToBoard(rect, 4);
        board.addShapesToBoard(rect, 3);
        board.addShapesToBoard(circle, 2);
        board.addShapesToBoard(tr, 1);
        board.showInfo();
        
	}

}

package Shape;

public class Main {
	public static void main(String[] args) {
		  Square square = new Square(5);
		  System.out.println("Area of square: " + square.area());

		  Rectangle rectangle = new Rectangle(5, 10);
		  System.out.println("Area of rectangle: " + rectangle.area());
		}
}

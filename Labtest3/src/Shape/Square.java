package Shape;

public class Square implements Shape {
	  int length;

	  // Default constructor
	  Square() {
	    this.length = 0;
	  }

	  // Parameterized constructor
	  Square(int length) {
	    this.length = length;
	  }

	  // Override the area() method
	  @Override
	  public int area() {
	    return this.length * this.length;
	  }
	}

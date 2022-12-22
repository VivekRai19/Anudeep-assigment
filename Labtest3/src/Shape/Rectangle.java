package Shape;

	public class Rectangle extends Square {
		  int width;

		  // Default constructor
		  Rectangle() {
		    super();  // call the constructor of the superclass
		    this.width = 0;
		  }

		  // Parameterized constructor
		  Rectangle(int length, int width) {
		    super(length);  // call the parameterized constructor of the superclass
		    this.width = width;
		  }

		  // Override the area() method
		  @Override
		  public int area() {
		    return this.length * this.width;
		  }
		}


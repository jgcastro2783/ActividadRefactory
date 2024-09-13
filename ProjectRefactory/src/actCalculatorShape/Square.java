package actCalculatorShape;

public class Square implements Shape {

	 private int side;

	    public Square(int side) {
	        this.side = side;
	    }

	    @Override
	    public double calculateArea() {
	        return side * side;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 4 * side;
	    }
}

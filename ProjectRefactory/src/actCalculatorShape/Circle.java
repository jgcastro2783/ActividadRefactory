package actCalculatorShape;

public class Circle implements Shape {

	 private int radius;

	    public Circle(int radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
}

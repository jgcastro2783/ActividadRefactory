package actCalculatorShape;

public class Sphere implements Shape {
	 private int radius;

	    public Sphere(int radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return 4 * Math.PI * radius * radius;
	    }

	    @Override
	    public double calculatePerimeter() {
	        // La esfera no tiene perímetro, retornamos 0
	        return 0;
	    }
}

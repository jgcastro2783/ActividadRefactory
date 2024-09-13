package actCalculatorShape;

public class Cube implements Shape {

	private int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculatePerimeter() {
        // El cubo no tiene perímetro, retornamos 0
        return 0;
    }

}

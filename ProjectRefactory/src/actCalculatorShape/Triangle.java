package actCalculatorShape;

public class Triangle implements Shape {
	private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // Asumiendo un triángulo equilátero para simplicidad
        return 3 * base;
    }

}

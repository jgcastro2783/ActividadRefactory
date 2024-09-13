package liskov.substitution;

public abstract class Employee {
	protected String nombre;
    protected int salarioBase;

    public Employee(String nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto que cada subclase debe implementar
    public abstract int calcularPago();
}

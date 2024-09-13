package liskov.substitution;

public class Programmer extends Employee {
	 private String lenguaje;

	    public Programmer(String nombre, int salarioBase, String lenguaje) {
	        super(nombre, salarioBase);
	        this.lenguaje = lenguaje;
	    }

	    @Override
	    public int calcularPago() {
	        // Aquí puedes añadir la lógica específica para el cálculo del pago de un Programador
	        return salarioBase; // Ejemplo simplificado
	    }

}

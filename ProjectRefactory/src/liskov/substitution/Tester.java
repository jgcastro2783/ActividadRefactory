package liskov.substitution;

public class Tester extends Employee {

	 public Tester(String nombre, int salarioBase) {
	        super(nombre, salarioBase);
	    }

	    @Override
	    public int calcularPago() {
	        // Aquí puedes añadir la lógica específica para el cálculo del pago de un Tester
	        return salarioBase; // Ejemplo simplificado
	    }

}

package liskov.substitution;

import java.util.*;
public class Main {
	 public static void calcularPagos() {
	        Tester[] testers = new Tester[]{
	            new Tester("Joan", 1000),
	            new Tester("Carmen", 1000)
	        };
	        
	        Programmer[] programadores = new Programmer[]{
	            new Programmer("Aida", 1000, "C#"),
	            new Programmer("Julia", 1000, "Java")
	        };

	        List<Employee> empleados = new ArrayList<>();
	        empleados.addAll(Arrays.asList(testers));
	        empleados.addAll(Arrays.asList(programadores));

	        int pagoTotal = 0;
	        for (Employee emp : empleados) {
	            pagoTotal += emp.calcularPago();
	        }
	        System.out.println("Pago total de empleados: " + pagoTotal);
	    }

	    public static void main(String[] args) {
	        calcularPagos();
	    }
}

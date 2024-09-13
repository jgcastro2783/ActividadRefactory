package dependency.inversion;

public class MongoDB implements DatabaseInterface {

	 @Override
	    public void ejecutarConsulta(String consulta) {
	        // Implementación específica para MongoDB
	    }

	    @Override
	    public void hacerCopiaDeSeguridad() {
	        System.out.println("Copia de seguridad de MongoDB");
	    }

	    @Override
	    public void hacerSondeo() {
	        System.out.println("Sondeo de MongoDB");
	    }
}



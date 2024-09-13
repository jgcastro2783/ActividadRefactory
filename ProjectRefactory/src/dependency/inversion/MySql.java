package dependency.inversion;

public class MySql implements DatabaseInterface {

	  @Override
	    public void ejecutarConsulta(String consulta) {
	        // Implementación específica para MySql
	    }

	    @Override
	    public void hacerCopiaDeSeguridad() {
	        System.out.println("Copia de seguridad de MySql");
	    }

	    @Override
	    public void hacerSondeo() {
	        System.out.println("Sondeo de MySql");
	    }
}

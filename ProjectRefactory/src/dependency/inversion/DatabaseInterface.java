package dependency.inversion;

public interface DatabaseInterface {
	  void ejecutarConsulta(String consulta);
	    void hacerCopiaDeSeguridad();
	    void hacerSondeo();
}

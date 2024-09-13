package dependency.inversion;

public final class Database {
	private DatabaseInterface baseDeDatos;

    // Constructor para inyectar la dependencia
    public Database(DatabaseInterface baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void ejecutarConsulta(String consulta) {
        baseDeDatos.ejecutarConsulta(consulta);
    }

    public void hacerCopiaDeSeguridad() {
        baseDeDatos.hacerCopiaDeSeguridad();
    }

    public void hacerSondeo() {
        baseDeDatos.hacerSondeo();
    }
}

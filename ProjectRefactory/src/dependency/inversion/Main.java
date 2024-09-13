package dependency.inversion;

public class Main {

	public static void main(String[] args) {
		  Database mysqlBaseDeDatos = new Database(new MySql());
	        mysqlBaseDeDatos.ejecutarConsulta("SELECT * FROM usuarios");
	        mysqlBaseDeDatos.hacerCopiaDeSeguridad();
	        mysqlBaseDeDatos.hacerSondeo();

	        Database mongoDBBaseDeDatos = new Database(new MongoDB());
	        mongoDBBaseDeDatos.ejecutarConsulta("db.usuarios.find()");
	        mongoDBBaseDeDatos.hacerCopiaDeSeguridad();
	        mongoDBBaseDeDatos.hacerSondeo();

	}

}

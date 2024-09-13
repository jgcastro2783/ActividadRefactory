package single.responsability;

public class Main {

	 public static void main(String[] args) {
	        Address address = new Address("Country", "City", "Street", 123);
	        User user = new User();
	        user.setFirstName("John");
	        user.setLastName("Doe");
	        user.setAddress(address);
	        user.setUser("johndoe");
	        user.setPassword("password123");
	        user.setEmail("johndoe@example.com");

	        // Actualizar la dirección
	        user.setAddress(new Address("NewCountry", "NewCity", "NewStreet", 456));

	        // Actualizar la contraseña
	        PasswordManager passwordManager = new PasswordManager();
	        passwordManager.updatePassword(user, "newpassword456");

	        // Enviar un correo electrónico
	        EmailService emailService = new EmailService();
	        emailService.sendEmail(user, "Subject", "This is the message.", "recipient@example.com");
	    }

}

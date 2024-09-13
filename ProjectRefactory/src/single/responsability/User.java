package single.responsability;

public class User {
	  private String firstName;
	    private String lastName;
	    private Address address;
	    private String user;
	    private String password;
	    private String email;

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public String getUser() {
	        return user;
	    }

	    public void setUser(String user) {
	        this.user = user;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public boolean authenticate(String user, String password) {
	        return this.user.equals(user) && this.password.equals(password);
	    }

	    @Override
	    public String toString() {
	        return "User{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", address=" + address +
	                ", user='" + user + '\'' +
	                ", password='" + password + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }
}

package school;

public class Contact {

	private String firstName;	//Create global variables
	private String lastName;
	private String id;
	private String phone;
	private String address;
	
	public Contact(String firstName, String lastName, String id, String phone, String address) {
		if(firstName == null || firstName.length() > 10) {	// If first name is null or too long...
			throw new IllegalArgumentException("Invalid First name");	// Throw error
		}
		if(lastName == null || lastName.length() > 10) {	// If last name is null or too long...
			throw new IllegalArgumentException("Invalid Last name");	// Throw error
		}
		if(id == null || id.length() > 10) {	// If unique id is null or too long...
			throw new IllegalArgumentException("Invalid Id");	// Throw error
		}
		if(phone == null || phone.length() != 10 || phone.matches("[a-zA-Z]+")) {	// If phone number is null, non numeric, or not exactly 10 digits...
			throw new IllegalArgumentException("Invalid Phone number");	// Throw error
		}
		if(address == null || address.length() > 30) {	// If address is null or too long...
			throw new IllegalArgumentException("Invalid Address");	// Throw error
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

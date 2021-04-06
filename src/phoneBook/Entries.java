package phoneBook;

public class Entries {

	public static Object fullName;
	public String firstName;
	public String middleName;
	public String lastName;
	public String phone;
	public String contactAddress;
	public String city;
	public String state;
	public String zip;
	public Entries(String firstName, String middleName, String lastName, String phone, String contactAddress,
			String city, String state, String zip) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phone = phone;
		this.contactAddress = contactAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return  firstName + " " + middleName + " " + lastName + " " + phone + " " + contactAddress + ". " + city + ", " + state + " " + zip;


	}
	
	

	



}

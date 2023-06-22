package project1;

public class Contact {
	
	// class attributes
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;	
	
	// Constructor
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.contactID = contactID;
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = firstName;
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = lastName;
		}
		
		if (phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNum = phoneNum;
		}
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = address;
		}
	}
	
	// Setters and Getters
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = newFirstName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = newLastName;
		}
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String newPhoneNum) {
		if (newPhoneNum == null || newPhoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNum = newPhoneNum;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = newAddress;
		}
	}
}

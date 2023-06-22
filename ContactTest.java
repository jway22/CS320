package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project1.Contact;


class ContactTest {
	String contactIDTest = "1234567890";
	String firstNameTest = "FName";
	String lastNameTest = "LName";
	String phoneNumTest = "6031231234";
	String addressTest = "1 Test Way, Test City";
	String longID = "98765432123456789";
	String longFName = "ABCDEFGHIJKLM";
	String longLName = "NOPQRSTUVWXYZ";
	String longPhone = "12345678987654321";
	String shortPhone = "123";
	String longAddress = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	@Test
	void testGetters() {
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		assertTrue(contact.getContactID().equals("1234567890"));
		assertTrue(contact.getFirstName().equals("FName"));
		assertTrue(contact.getLastName().equals("LName"));
		assertTrue(contact.getPhoneNum().equals("6031231234"));
		assertTrue(contact.getAddress().equals("1 Test Way, Test City"));
	}
	
	@Test
	void testSetters() {
		Contact contact = new Contact("A", "B", "C", "1234567890", "D");
		contact.setFirstName(firstNameTest);
		contact.setLastName(lastNameTest);
		contact.setPhoneNum(phoneNumTest);
		contact.setAddress(addressTest);
		assertAll("contact",
				() -> assertTrue(contact.getFirstName().equals("FName")),
				() -> assertTrue(contact.getLastName().equals("LName")),
				() -> assertTrue(contact.getPhoneNum().equals("6031231234")),
				() -> assertTrue(contact.getAddress().equals("1 Test Way, Test City")));
		assertThrows(IllegalArgumentException.class, 
				() -> contact.setFirstName(longFName));
		assertThrows(IllegalArgumentException.class, 
				() -> contact.setLastName(longLName));
		assertThrows(IllegalArgumentException.class, 
				() -> contact.setPhoneNum(longPhone));
		assertThrows(IllegalArgumentException.class, 
				() -> contact.setPhoneNum(shortPhone));
		assertThrows(IllegalArgumentException.class, 
				() -> contact.setAddress(longAddress));
		
	}
}

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import project1.Contact;
import project1.ContactService;

class ContactServiceTest {
	String contactIDTest = "1234567890";
	String firstNameTest = "FName";
	String lastNameTest = "LName";
	String phoneNumTest = "6031231234";
	String addressTest = "1 Test Way, Test City";

	

	@Test
	void newContactTest() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		assertAll("service",
				() -> assertNotNull(service.getContactList().get(0).getContactID()),
				() -> assertNotNull(service.getContactList().get(0).getFirstName()),
				() -> assertNotNull(service.getContactList().get(0).getLastName()),
				() -> assertNotNull(service.getContactList().get(0).getPhoneNum()),
				() -> assertNotNull(service.getContactList().get(0).getAddress()));
	}
	
	@Test
	void searchTest() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		String contactID0 = service.getContactList().get(0).getContactID();
		assertEquals(service.searchID(contactID0), 0);
	}
	
	@Test
	void deleteTest() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		Contact contact1 = new Contact("123", "FNameTest", "LNameTest", "1234567890", "AddressTest");
		service.newContact(contact);
		service.newContact(contact1);
		String contactID0 = service.getContactList().get(0).getContactID();
		String contactID1 = service.getContactList().get(1).getContactID();
		service.deleteContact(contactID0);
		assertEquals(service.searchID(contactID1), 0);
	}
	
	@Test
	void editFirstNameTests() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		String contactID = service.getContactList().get(0).getContactID();
		service.editFirstName(contactID, "Jon");
		assertTrue(service.getContactList().get(0).getFirstName().equals("Jon"));
	}
	
	@Test
	void editLastNameTests() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		String contactID = service.getContactList().get(0).getContactID();
		service.editLastName(contactID, "Way");
		assertTrue(service.getContactList().get(0).getLastName().equals("Way"));
	}
	
	@Test
	void editPhoneNumTests() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		String contactID = service.getContactList().get(0).getContactID();
		service.editPhoneNum(contactID, "9876543210");
		assertTrue(service.getContactList().get(0).getPhoneNum().equals("9876543210"));
	}
	
	@Test
	void editAddressTests() {
		ContactService service = new ContactService();
		Contact contact = new Contact(contactIDTest, firstNameTest, lastNameTest, phoneNumTest, addressTest);
		service.newContact(contact);
		String contactID = service.getContactList().get(0).getContactID();
		service.editAddress(contactID, "123 Test Dr, Test Town");
		assertTrue(service.getContactList().get(0).getAddress().equals("123 Test Dr, Test Town"));		
	}
}

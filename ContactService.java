package project1;

import java.util.ArrayList;


public class ContactService {
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// create new contact and add to list
	public void newContact(Contact contact) {
		int listIndex;
		listIndex = searchID(contact.getContactID());
		
		// here you need to verify that the ID is not in list 
		if (listIndex != -1) {
			throw new IllegalArgumentException("Duplicate ID");
		}
		else {
            contactList.add(contact); 
		}
	}
	
	// search for list position matching unique ID
	public int searchID(String uniqueID) {
		int i;
		int listNum = -1;
		
		for (i = 0; i < contactList.size(); i++) {
			Contact current = contactList.get(i);
			if (current.getContactID() == uniqueID) {
				listNum = i;
			}
		}
		return listNum;
	}
	
	public void deleteContact(String contactID) {
		int listNum = searchID(contactID);
		if (listNum == -1) {
			System.out.println("Contact does not exist.");
		}
		else {
			contactList.remove(listNum);
		}
	}
	
	// update contact information
	public void editFirstName(String contactID, String firstName) {
		int listNum = searchID(contactID);
		Contact contact;
				
		if (listNum == -1) {
			System.out.println("Contact does not exist.");
		}
		else {
			contact = contactList.get(listNum);
			contact.setFirstName(firstName);	
		}
	}
	
	public void editLastName(String contactID, String lastName) {
		int listNum = searchID(contactID);
		Contact contact;
		
		if (listNum == -1) {
			System.out.println("Contact does not exist.");
		}
		else {
			contact = contactList.get(listNum);
			contact.setLastName(lastName);
		}
	}
	
	public void editPhoneNum(String contactID, String phoneNum) {
		int listNum = searchID(contactID);
		Contact contact;
		
		if (listNum == -1) {
			System.out.println("Contact does not exist.");
		}
		else {
			contact = contactList.get(listNum);
			contact.setPhoneNum(phoneNum);
		}
	}
	
	public void editAddress(String contactID, String address) {
		int listNum = searchID(contactID);
		Contact contact;
		
		if (listNum == -1) {
			System.out.println("Contact does not exist.");
		}
		else {
			contact = contactList.get(listNum);
			contact.setAddress(address);
		}
	}
	
	public ArrayList<Contact> getContactList() {
		return contactList;
	}
}

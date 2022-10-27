package PhoneBookManipulation;

import java.util.*;

public class PhoneBook {
	// Create a class PhoneBook with a private attribute
	private List<Contact> phoneBook = new ArrayList<Contact>();

	// Write the getters and setters.
	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}

	// Write the following methods in the PhoneBook class.

	// This method should add the contact object to the phoneBook list.
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}

	// This method should return the list of all contacts available.
	public List<Contact> viewAllContacts() {
		List<Contact> viewAllContacts = new ArrayList<>();
		for (Contact contactObj : phoneBook) {
			viewAllContacts.add(contactObj);
		}
		return viewAllContacts;
	}

	// This method should return the contact details which has the phoneNumber given
	// as parameter.
	public Contact viewContactGivenPhone(long phoneNumber) {
		// List<Contact> viewContactGivenPhone = new ArrayList<>();
		Contact con = new Contact();
		for (Contact contactObj : phoneBook) {
			if (contactObj.getPhoneNumber() == phoneNumber) {
				// viewContactGivenPhone.add(contactObj);
				con = contactObj;
			}
		}
		return con;
	}

	// This method should remove the contact details which has the phoneNumber given
	// as parameter.
	// If removed return true. Else if the phone number is not available return
	// false.
	public boolean removeContact(long phoneNumber) {
		boolean f = false;
		for (Contact contactObj : phoneBook) {
			if (contactObj.getPhoneNumber() == phoneNumber) {
				f = true;
				phoneBook.remove(contactObj);
				break;
			}
		}
		return f;
	}
}

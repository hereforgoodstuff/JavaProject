package PhoneBookManipulation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Menu");
			System.out.println("1.Add Contact");
			System.out.println("2.Display All Contacts");
			System.out.println("3.Search contact by phone");
			System.out.println("4.Remove contact");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			userChoice = Integer.parseInt(sc.nextLine());
			PhoneBook phoneBook = new PhoneBook();
			
			switch (userChoice) {
			case 1:
				System.out.println("Add a Contact:");

				System.out.println("First Name: ");
				String firstName = sc.next();

				System.out.println("Last Name: ");
				String lastName = sc.next();

				System.out.println("Phone No.: ");
				long phoneNumber = Long.parseLong(sc.nextLine());

				System.out.println("Email: ");
				String emailId = sc.nextLine();

				Contact contact = new Contact(firstName, lastName, phoneNumber, emailId);
				phoneBook.addContact(contact);
				break;
				
			case 2:
				System.out.println("The contacts in List are:");
				phoneBook.viewAllContacts();
				break;
				
			case 3:	
				System.out.println("Enter the Phone number to search contact:");
				long phoneNumberView = Long.parseLong(sc.nextLine());
				//phoneBook.viewContactGivenPhone(phoneNumberView);
				Contact obj1 = phoneBook.viewContactGivenPhone(phoneNumberView);
				System.out.println("The Contact is:");
				System.out.println("First Name:" + obj1.getFirstName());
				System.out.println("Last Name:" + obj1.getLastName());
				System.out.println("Phone No.:" + obj1.getPhoneNumber());
				System.out.println("Email:" + obj1.getEmailId());
				break;
			
			case 4:
				System.out.println("Enter the Phone number to remove :");
				 long phoneNumberCheckDelete = Long.parseLong(sc.nextLine());
				System.out.println("Do you want to remove the contact (Y/N): ");
				char YN = sc.next().charAt(0);
				if (YN == 'Y') {
					phoneBook.removeContact(phoneNumberCheckDelete);
					System.out.println("The contact is successfully deleted.");
				}
				break;
			
			case 5:
		         break;
		         
			default:
				System.out.println("Please enter input between 1-5 only");
				break;
			}

		} while (userChoice != 5);

	}

}

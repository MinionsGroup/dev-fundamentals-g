package contactManager;

import java.util.Scanner;

public class contactMain {

	public static void main(String [] args){
		ContactManager myContactManager = new ContactManager();
		Contact contact = new Contact();
		int numberContact;
		String  name, phone;
		
		System.out.println("Enter # contacts to add :");
		Scanner scanner = new Scanner(System.in);
		numberContact = scanner.nextInt();
		
		for(int i =0 ; i<numberContact; i++) {
			System.out.println("Enter name :");
	    	name = scanner.nextLine();	
	    	contact.setName(name);
	    	
	    	System.out.println("Enter phone :");
	    	phone = scanner.nextLine();
	    	contact.setphoneNumber(phone);		
	    	
	    	myContactManager.addContact(contact);
		} 
		
		Contact contactSearch =  myContactManager.searchContact("Maria");
		System.out.println("Phone Number is :"+ contactSearch.getphoneNumber());
	}

}

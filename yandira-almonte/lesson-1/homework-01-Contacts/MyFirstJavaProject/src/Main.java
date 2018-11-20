
public class Main {
	public static void main(String[] args) {

		ContactsManager myContacts = new ContactsManager();

		myContacts.addContact(new Contact("James Carstairs", "02396789451"));
		myContacts.addContact(new Contact("Will Herondale", "87996789451"));
		myContacts.addContact(new Contact("Magnus Bane", "359678451"));
		myContacts.addContact(new Contact("Tessa Gray", "32596789451"));
		myContacts.addContact(new Contact("Alex Bane", "3856789451"));

		Contact foundContact = myContacts.searchContact("James Carstairs");
		foundContact.showContact();

	}
}

public class Main {

    public static void main(String[] args) {

        //Implementing the Exercise
        ContactsManager myContactsManager = new ContactsManager();
        //Create 1 contact
        Contact contact = new Contact();
        contact.name = "JhonTest";
        contact.phoneNumber = "02345-56";
        myContactsManager.addContact(contact);
        //Create 2 contact
        Contact contact1 = new Contact();
        contact1.name = "JhonTest01";
        contact1.phoneNumber = "456";
        myContactsManager.addContact(contact1);
        //Create 3 contact
        Contact contact2 = new Contact();
        contact2.name = "JhonTest02";
        contact2.phoneNumber = "9-9999-99";
        myContactsManager.addContact(contact2);
        //Create 4 contact
        Contact contact3 = new Contact();
        contact3.name = "JhonTest03";
        contact3.phoneNumber = "898-595";
        myContactsManager.addContact(contact3);
        //searching of contact  contact3.name = "JhonTest03";
        Contact contactFound = myContactsManager.searchContact(contact3.name);
        System.out.println("Phone of Contact" + contactFound.phoneNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        //Implementing the Exercise
        ContactsManager myContactsManager = new ContactsManager();
        //Create 1 contact
        Contact contact = new Contact();
        contact.setName("JhonTest");
        contact.setPhoneNumber("02345-56");
        myContactsManager.addContact(contact);
        //Create 2 contact
        Contact contact1 = new Contact();
        contact.setName("JhonTest01");
        contact.setPhoneNumber("456");
        myContactsManager.addContact(contact1);
        //Create 3 contact
        Contact contact2 = new Contact();
        contact.setName("JhonTest02");
        contact.setPhoneNumber("9-9999-99");
        //Create 4 contact
        Contact contact3 = new Contact();
        contact.setName("JhonTest03");
        contact.setPhoneNumber("898-565");
        myContactsManager.addContact(contact3);
        //searching of contact  contact3.name = "JhonTest03";
        Contact contactFound = myContactsManager.searchContact("JhonTest03");
        System.out.println("Phone of Contact" + contactFound.getPhoneNumber());
    }
}
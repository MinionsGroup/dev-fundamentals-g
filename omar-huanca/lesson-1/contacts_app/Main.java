package contacts_app;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.setName("Pepito 1");
        contact1.setPhoneNumber("591-1234-1");

        Contact contact2 = new Contact();
        contact2.setName("Pepito 2");
        contact2.setPhoneNumber("591-1234-2");

        Contact contact3 = new Contact();
        contact3.setName("Pepito 3");
        contact3.setPhoneNumber("591-1234-3");

        Contact contact4 = new Contact();
        contact4.setName("Pepito 4");
        contact4.setPhoneNumber("591-1234-4");

        Contact contact5 = new Contact();
        contact5.setName("Pepito 5");
        contact5.setPhoneNumber("591-1234-5");

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);
        myContactsManager.addContact(contact3);
        myContactsManager.addContact(contact4);
        myContactsManager.addContact(contact5);

        System.out.println(myContactsManager.searchContact(contact5.getName()).getPhoneNumber());
        System.out.println(myContactsManager.searchContact(contact4.getName()).getPhoneNumber());
        System.out.println(myContactsManager.searchContact(contact3.getName()).getPhoneNumber());
        System.out.println(myContactsManager.searchContact(contact2.getName()).getPhoneNumber());
        System.out.println(myContactsManager.searchContact(contact1.getName()).getPhoneNumber());
    }
}

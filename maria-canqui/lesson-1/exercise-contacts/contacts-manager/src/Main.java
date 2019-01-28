
public class Main {
    public static void main(String[] args) {

        ContactManager myContactManager = new ContactManager();

        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact contact3 = new Contact();
        Contact contact4 = new Contact();

        contact1.name = "teresa";
        contact1.phoneNumber = "72741587";
        contact2.name = "when";
        contact2.phoneNumber = "345353";
        contact3.name = "Danae";
        contact3.phoneNumber = "564645";


        myContactManager.addContact(contact1);
        myContactManager.addContact(contact2);
        myContactManager.addContact(contact3);

        Contact contact = myContactManager.searchContact("teresa");

        System.out.println(contact.name + ": " + contact.phoneNumber);

    }
}

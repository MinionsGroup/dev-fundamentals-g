public class Main {
    public static void main(String [] args){
        ContactManager myContactManager = new ContactManager();

        Contact contact1 = new Contact();
        contact1.name = "Jin Kazama";
        contact1.phoneNumber = "4200200";
        myContactManager.addContact(contact1);
        Contact contact2 = new Contact();
        contact2.name = "Kazuya Mishima";
        contact2.phoneNumber = "4100100";
        myContactManager.addContact(contact2);
        Contact contact3 = new Contact();
        contact3.name = "Paul Phoenix";
        contact3.phoneNumber = "4300300";
        myContactManager.addContact(contact3);
        Contact contact4 = new Contact();
        contact4.name = "Marshall Law";
        contact4.phoneNumber = "4400400";
        myContactManager.addContact(contact4);
        Contact contact = myContactManager.searchContact(contact1.name);
        System.out.println("Contact Name: " + contact.name);
        System.out.println("Phone number: "+ contact.phoneNumber);
    }
}

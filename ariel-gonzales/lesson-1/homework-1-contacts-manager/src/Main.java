
public class Main {
    /**
     * contatcs_manager.Main Method.
     *
     * @param args
     */
    public static void main(String[] args) {

        //Create a myContactManager(List of Contacts).
        ContactManager myContactManager = new ContactManager();

        //Create contact Objects.
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact contact3 = new Contact();
        Contact contact4 = new Contact();

        //Init Contacts.
        contact1.name = "Sarah";
        contact1.phoneNumber = "72741587";
        contact2.name = "Glen";
        contact2.phoneNumber = "70365214";
        contact3.name = "Vito";
        contact3.phoneNumber = "72798774";
        contact4.name = "Jhal";
        contact4.phoneNumber = "70754158";

        //Add Contacts into the list myContactManager.
        myContactManager.addContact(contact1);
        myContactManager.addContact(contact2);
        myContactManager.addContact(contact3);
        myContactManager.addContact(contact4);

        //c = the contact that have been found.
        Contact c = myContactManager.searchContact("Jhal");

        //Print result.
        System.out.println(c.name + ": " + c.phoneNumber);

        //Update the new search.
        c = myContactManager.searchContact("Vito");

        //Print result.
        System.out.println(c.name + ": " + c.phoneNumber);
    }
}

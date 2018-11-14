public class MainContact {
    public static void main(String[] args) {
        // Create the ContactsManager object
        Contact.ContactsManager myContactsManager = new Contact.ContactsManager();
        // Create a new Contact object for James
        Contact friendMario = new Contact();
        // Set the fields
        friendMario.name = "Mario";
        friendMario.phoneNumber = "555123456";
        // Add James Contact to the ContactsManager
        myContactsManager.addContact(friendMario);
        // Create a new Contact object for Cezanne
        Contact friendDiego = new Contact();
        // Set the fields
        friendDiego.name = "Diego";
        friendDiego.phoneNumber = "555987654";
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendDiego);
        // Create a new Contact object for Jessica
        Contact friendAngela = new Contact();
        // Set the fields
        friendAngela.name = "Angela";
        friendAngela.phoneNumber = "555741258";
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendAngela);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Angela");
        System.out.println(result.phoneNumber);


    }
}

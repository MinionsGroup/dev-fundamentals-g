public class Main {
    public static void main(String [] args) {
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        // Create a new Contact object
        Contact friendJuan = new Contact();
        // Set the fields
        friendJuan.name = "James";
        friendJuan.phoneNumber = "0012223333";
        // Add James Contact to the ContactsManager
        myContactsManager.addContact(friendJuan);

        // Create a new Contact object
        Contact friendCesar = new Contact();
        // Set the fields
        friendCesar.name = "Cezanne";
        friendCesar.phoneNumber = "987654321";
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendCesar);

        // Create a new Contact object
        Contact friendJessica = new Contact();
        // Set the fields
        friendJessica.name = "Jessica";
        friendJessica.phoneNumber = "5554440001";
        // Add Jessica Contact to the ContactsManager
        myContactsManager.addContact(friendJessica);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("James");
        System.out.println(result.phoneNumber);
    }
}

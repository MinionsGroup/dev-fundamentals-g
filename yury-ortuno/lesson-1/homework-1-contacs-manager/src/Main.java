/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class Main {
    public static void main(String[] args) {
        // Create the ContactsManager object
        ContactManager contactsManager = new ContactManager();

        // Create a new Contact object for James
        Contact friendJames = new Contact();
        // Set the fields
        friendJames.setName("James");
        friendJames.setPhoneNumber("0012223333");
        // Add James Contact to the ContactsManager
        contactsManager.addContact(friendJames);

        // Create a new Contact object for Cezanne
        Contact friendCezanne = new Contact();
        // Set the fields
        friendCezanne.setName("Cezanne");
        friendCezanne.setPhoneNumber("987654321");
        // Add Cezanne Contact to the ContactsManager
        contactsManager.addContact(friendCezanne);

        // Create a new Contact object for Jessica
        Contact friendJessica = new Contact();
        // Set the fields
        friendJessica.setName("Jessica");
        friendJessica.setPhoneNumber("5554440001");
        // Add Jessica Contact to the ContactsManager
        contactsManager.addContact(friendJessica);

        // Now let's try to search of a contact and display their phone number
        Contact result = contactsManager.searchContact("James");
        if (result != null){
            System.out.println("The number is: " + result.getPhoneNumber());
        }else {
            System.out.println("There isn´t contact");
        }
    }
}

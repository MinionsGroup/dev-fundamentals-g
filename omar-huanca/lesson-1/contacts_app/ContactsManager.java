package contacts_app;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is to manage Contacts
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class ContactsManager {
    private List<Contact> contactsList;

    /**
     * Constructor for Contact Manager
     * This method is for initialize contact attributes
     */
    public ContactsManager() {
        contactsList = new ArrayList<>();
    }

    /**
     * This method is to add a Contact in to list of contactsList
     * @param contact contact to add in the list
     */
    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    /**
     * This method is to search a Contact by name in to contact list
     * @param searchName name of contact to search
     * @return Contact with contact information
     */
    public Contact searchContact(String searchName) {
        return contactsList.stream()
                .filter(customer -> searchName.equalsIgnoreCase(customer.getName()))
                .findAny()
                .orElse(null);
    }
}

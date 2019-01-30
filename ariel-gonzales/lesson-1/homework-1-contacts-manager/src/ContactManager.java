
/**
 * contatcs_manager.ContactManager, is an array of Contacts.
 */
public class ContactManager {
    Contact[] myFriends;
    int friendsCount;

    /**
     * contatcs_manager.ContactManager Constructors.
     */
    public ContactManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    /**
     * This method add Contacts into myFriends.
     *
     * @param contact contact object.
     */
    void addContact(Contact contact) {
        myFriends[this.friendsCount] = contact;
        this.friendsCount++;
    }

    /**
     * This method find any contact by name.
     *
     * @param searchName contact name.
     * @return contact object. It could be contact or null.
     */
    Contact searchContact(String searchName) {
        for (Contact contact : myFriends) {
            if (contact.name.equals(searchName)) {
                return contact;
            }
        }
        return null;
    }
}

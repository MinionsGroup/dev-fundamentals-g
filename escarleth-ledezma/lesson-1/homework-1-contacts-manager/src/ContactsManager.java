public class ContactsManager {
    // Fields:
    private Contact[] myFriends;
    private int friendsCount;

    // Constructor:
    public ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

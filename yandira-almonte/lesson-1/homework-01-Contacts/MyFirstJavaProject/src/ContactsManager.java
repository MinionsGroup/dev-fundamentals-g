
public class ContactsManager {


	Contact[] myFriends;
	private int friendsCount;

	public ContactsManager() {
		this.friendsCount = 0;
		this.myFriends = new Contact[500];
	}

	void addContact(Contact contact) {
		myFriends[friendsCount] = contact;
		friendsCount++;
	}

	Contact searchContact(String searchName) {
		for (int i = 0; i < friendsCount; i++) {
			if (myFriends[i].getName().equals(searchName)){
				return myFriends[i];
			}
		}
		return null;
	}
	
	
	
}

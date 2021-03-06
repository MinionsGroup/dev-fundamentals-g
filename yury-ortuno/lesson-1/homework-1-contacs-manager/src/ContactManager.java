/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class ContactManager {
    // Fields:
    private Contact [] myFriends;
    private int friendsCount;
    // Constructor:
    ContactManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].getName().equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

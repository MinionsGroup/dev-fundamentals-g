package lesson_1.practice_01;

/**
 * Created by Daniel Cabero
 *
 * @since 12/11/2018.
 */
class ContactsManager {

    Contact[] myFriends;

    int friendsCount;

    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
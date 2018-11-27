public class Contact {

        String name;
        String phoneNumber;

    static class ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;
        // Constructor:
        ContactsManager(){
            this.friendsCount = 0;
            this.myFriends = new Contact[500];
        }
        public void addContact(Contact contact){
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
}

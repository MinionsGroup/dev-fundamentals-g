public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContanct(String nameToSearch){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(nameToSearch)){
                return myFriends[i];
            }
        }
        return null;
    }
}

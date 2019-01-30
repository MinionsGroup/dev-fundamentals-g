package company;

class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    // Search a name
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }


    public void showAll() {
        System.out.println("  ----Name----  |  ----Phone Number----  |  ----Email----  ");
        for (int i = 0; i < friendsCount; i++) {
            System.out.println( i+1 +".-   "+myFriends[i].name+"        "+myFriends[i].phoneNumber+"        "+myFriends[i].email);

        }
    }
}

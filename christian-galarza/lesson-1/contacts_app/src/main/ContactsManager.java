package main;
 /**
 * This class is create a Contact
 *
 * @author Jose Christian Galarza Crespo
 * @version 1.0.
 */
class ContactsManager {
    private Contact [] myFriends;
    private int friendsCount;
     /**
     * Constructor for Contact.
     * This method is for initialize contact attributes.
     */
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }
     /**
     * Method for  add Contacts.
     * @param contact contact.
     */
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
     /**
     * Method for search Contacts.
     * @param searchName String.
     * @return contact.
     */
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
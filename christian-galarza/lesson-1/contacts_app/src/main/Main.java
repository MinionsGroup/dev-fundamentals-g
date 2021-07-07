package main;
 /**
 * This class is start the program.
 *
 *  @author Jose Christian Galarza Crespo
 *  @version 1.0.
 *
 */
 class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact friendJames = new Contact();
         friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        friendJames.email = "James@gmail.com";
        myContactsManager.addContact(friendJames);
         Contact friendGarfi = new Contact();
        friendGarfi.name = "Garfi";
        friendGarfi.phoneNumber = "987654321";
        myContactsManager.addContact(friendGarfi);
         Contact friendAmalia = new Contact();
        friendAmalia.name = "Amalia";
        friendAmalia.phoneNumber = "5554440001";
        friendAmalia.email = "Osita@yahoo.com";
        myContactsManager.addContact(friendAmalia);
         Contact result = myContactsManager.searchContact("Garfi");
        System.out.println("El numero de " + result.name + " es "+ result.phoneNumber);
    }
}
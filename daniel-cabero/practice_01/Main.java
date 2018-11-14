package practice_01;

/**
 * Created by Daniel Cabero
 *
 * @since 12/11/2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Game game = new Game();
        Game game2 = new Game(54);

        ContactsManager myContactsManager = new ContactsManager();
        Contact friendJames = new Contact();
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        myContactsManager.addContact(friendJames);
        Contact friendCezanne = new Contact();
        friendCezanne.name = "Cezanne";
        friendCezanne.phoneNumber = "987654321";
        myContactsManager.addContact(friendCezanne);
        Contact friendJessica = new Contact();
        friendJessica.name = "Jessica";
        friendJessica.phoneNumber = "5554440001";
        myContactsManager.addContact(friendJessica);
        Contact result = myContactsManager.searchContact("Jessica");
        System.out.println(result.phoneNumber);
    }
}

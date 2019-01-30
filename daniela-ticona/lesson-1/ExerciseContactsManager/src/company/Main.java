package company;

public class Main {

    public static void main(String[] args) {

        ContactsManager myContactManager = new ContactsManager();

        myContactManager.addContact(new Contact("Daniela Ticona", "79152648", "miau@test01.com"));
        myContactManager.addContact(new Contact("Juan Perez", "79152649", "miau@test02.com"));
        myContactManager.addContact(new Contact("Choi siwon", "79152650", "miau@test03.com"));
        myContactManager.addContact(new Contact("Park Jung soo", "791526544", "miau@test04.com"));
        Contact foundContact = myContactManager.searchContact("Juan Perez");
        foundContact.showContact();
      // myContactManager.showAll();

    }
}

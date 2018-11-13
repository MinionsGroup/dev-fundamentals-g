public class MainClass {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager ();
        Contact firstContact = new Contact();
        firstContact.setName("Juan");
        firstContact.setPhoneNumber("77788811");
        myContactManager.addContact(firstContact);

        Contact secondContact = new Contact();
        secondContact.setName("Jose");
        secondContact.setPhoneNumber("65498732");
        myContactManager.addContact(secondContact);

        Contact thirdContact = new Contact();
        thirdContact.setName("Andres");
        thirdContact.setPhoneNumber("69874512");
        myContactManager.addContact(thirdContact);

        Contact fourthContact = new Contact();
        fourthContact.setName("Paola");
        fourthContact.setPhoneNumber("78558896");
        myContactManager.addContact(fourthContact);

        Contact searchResult = myContactManager.searchContact("Jose");
        System.out.println("Result: " + searchResult.getName());
    }
}

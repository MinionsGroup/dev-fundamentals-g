public class Main {

    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact firstContact = new Contact();
        firstContact.setName("Ana");
        firstContact.setPhoneNumber("7000000");
        myContactManager.addContact(firstContact);

        Contact secondContact = new Contact();
        secondContact.setName("Anita");
        secondContact.setPhoneNumber("71111111");
        myContactManager.addContact(secondContact);

        Contact thirdContact = new Contact();
        thirdContact.setName("Anael");
        thirdContact.setPhoneNumber("72222222");
        myContactManager.addContact(thirdContact);

        Contact fourthContact = new Contact();
        fourthContact.setName("Anabel");
        fourthContact.setPhoneNumber("73333333");
        myContactManager.addContact(fourthContact);

        Contact fifthContact = new Contact();
        fifthContact.setName("Anabela");
        fifthContact.setPhoneNumber("74444444");
        myContactManager.addContact(fifthContact);

        Contact foundContact = myContactManager.searchContact("Anabel");
        System.out.print("The contact phone number found is: ".concat(foundContact.getPhoneNumber()));
    }
}

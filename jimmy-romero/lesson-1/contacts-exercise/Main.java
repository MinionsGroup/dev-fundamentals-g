public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact firstContact = new Contact();
        firstContact.setName("Jin");
        firstContact.setPhoneNumber("70707070");
        firstContact.setEmail("jin@hotmail.com");
        myContactManager.addContact(firstContact);

        Contact secondContact = new Contact();
        secondContact.setName("Rui");
        secondContact.setPhoneNumber("71717171");
        secondContact.setEmail("rui@outlook.com");
        myContactManager.addContact(secondContact);

        Contact thirdContact = new Contact();
        thirdContact.setName("Kai");
        thirdContact.setPhoneNumber("74747474");
        thirdContact.setEmail("kai@gmail.com");
        myContactManager.addContact(thirdContact);

        Contact fourthContact = new Contact();
        fourthContact.setName("Shin");
        fourthContact.setPhoneNumber("72727272");
        fourthContact.setEmail("shin@hotmail.com");
        myContactManager.addContact(fourthContact);

        Contact searchResult = myContactManager.searchContact("Rui");
        System.out.println("Name: " + searchResult.getName());
        System.out.println("Email: " + searchResult.getEmail());
        System.out.println("Phone: " + searchResult.getPhoneNumber());
    }
}

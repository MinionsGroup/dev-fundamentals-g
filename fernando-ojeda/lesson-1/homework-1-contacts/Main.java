public class Main {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact contact1 = new Contact("Eduardo", "eduardo@yahoo.com", "12345");
        Contact contact2 = new Contact("Carlos", "Carlos@yahoo.com", "11111");
        Contact contact3 = new Contact("Karen", "karen@yahoo.com", "22222");

        myContactManager.addContact(contact1);
        myContactManager.addContact(contact2);
        myContactManager.addContact(contact3);

        Contact contact = myContactManager.searchContact("Eduardo");

        System.out.printf("The phone number of the contact is: "
        + contact.getPhoneNumber());
    }
}

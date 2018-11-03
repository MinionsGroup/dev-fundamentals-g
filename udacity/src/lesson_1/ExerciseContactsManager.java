package lesson_1;

public class ExerciseContactsManager {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact skipi = new Contact("skipi","448-4125-5622");
        myContactsManager.addContact(skipi);
        myContactsManager.addContact(new  Contact("mariela","451-5555-7622"));
        myContactsManager.addContact(new  Contact("gabriela","555-5555-5792"));
        myContactsManager.addContact(new  Contact("manuel","145-5574-5982"));
        myContactsManager.addContact(new  Contact("domingo","679-5565-5452"));
        System.out.println(myContactsManager.searchContact("manuel").name);
    }
}

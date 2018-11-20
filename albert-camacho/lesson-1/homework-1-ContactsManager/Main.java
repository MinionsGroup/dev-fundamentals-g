class Main {
    public static void main(String [] args){
       ContactsManager myContactManager = new ContactsManager();

       Contact contact01 = new Contact();
       contact01.name = "Juan Perez";
       contact01.phoneNumber = "00154654654";

       Contact contact02 = new Contact();
       contact02.name = "Marcelo Gomez";
       contact02.phoneNumber = "50154654";

       Contact contact03 = new Contact();
       contact03.name = "Pamela Garcia";
       contact03.phoneNumber = "955454545";

       Contact contact04 = new Contact();
       contact04.name = "Lizz Camacho";
       contact04.phoneNumber = "65421321";

       Contact contact05 = new Contact();
       contact05.name = "Marco Llano";
       contact05.phoneNumber = "46546545";

       myContactManager.addContact(contact01);
       myContactManager.addContact(contact02);
       myContactManager.addContact(contact03);
       myContactManager.addContact(contact04);
       myContactManager.addContact(contact05);

       Contact friend = myContactManager.searchContact("Pamela Garcia");

       System.out.println("Name: " + friend.name + "\tPhone number: " + friend.phoneNumber);
    }
}

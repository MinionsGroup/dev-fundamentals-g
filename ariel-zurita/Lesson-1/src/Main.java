public class Main {
    public static void main(String[] args){
      ContactsManager myContactManager = new ContactsManager();
      //Contact 1
      Contact newFriend = new Contact();
      newFriend.name = "Ariel";
      newFriend.email = "ariel@test.com";
      newFriend.phoneNumber = "+59170301384";
      //Contact 2
      Contact newFriend2 = new Contact();
      newFriend2.name = "Test";
      newFriend2.email = "test@test.com";
      newFriend2.phoneNumber = "+5914746391";
      //Adding contacts
      myContactManager.addContact(newFriend);
      myContactManager.addContact(newFriend2);
      //Searching and printing contact
      Contact res = myContactManager.searchContact("Test");
      System.out.println(res.phoneNumber);
    }
}

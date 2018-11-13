package lesson_1;

public class Contact {
    String name;
    String email;
    String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.email = "";
        this.phoneNumber = phoneNumber;
    }
}

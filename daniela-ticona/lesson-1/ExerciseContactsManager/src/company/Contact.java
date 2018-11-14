package company;

public class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email=email;
    }

    public void showContact(){
        System.out.println("Name: "+ this.name +"   Phone number: "+this.phoneNumber );
    }






}

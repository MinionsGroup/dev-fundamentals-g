public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact() {
        name = "";
        phoneNumber = "";
        email = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

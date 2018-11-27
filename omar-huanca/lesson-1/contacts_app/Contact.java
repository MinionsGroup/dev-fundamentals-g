package contacts_app;

/**
 * This class is create a Contact
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    /**
     * Constructor for Contact.
     * This method is for initialize contact attributes
     */
    public Contact() {
        this.name = "";
        this.phoneNumber = "";
    }

    /**
     * This method is to get Name of contact
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method is to set the Name of contact
     * @param name, contact name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is to get Phone Number of contact
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method is to set Phone Number of contact
     * @param phoneNumber, phone number of contact
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

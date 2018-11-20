
public class Contact {
	private String name;
	private String email;
	private String phoneNumer;

	Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumer = phoneNumber;
	}
	
	public void showContact(){
		System.out.println("Name: "+ this.name +" Number: "+this.phoneNumer);
	}
	
	public String getName(){
		return name;
	}
}

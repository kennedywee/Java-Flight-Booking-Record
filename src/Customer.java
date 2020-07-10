
public class Customer {
	
	int id;
	String name;
	String email;
	String phone;
	
	public Customer (int id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getId() {
		return this.id;
	}
   
	public void printBookingID(){
      System.out.println("This is your Booking ID : " + id);
	}
   	
	public void printCustomer() {
      System.out.println("\nBooking No.   : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone +"\n");
	}

}
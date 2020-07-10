
public class Booking {
	int cost;
	Customer customer;
	Flight flight;
	
	public Booking (Customer customer, Flight flight) {
		this.customer = customer;
		this.flight = flight;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Flight getFlight() {
		return flight;
	}
	
	public int getCost(){
		return 100;
		
	}

}

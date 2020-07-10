/**
Kumpulan 4 (booking record (Flight ticket))
1. Ferez Fernandez BI19110170
2. Tan Zheng Yuan BI19110238
3. Nethanel Jushua BI19110167
**/

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		ArrayList <Flight> flights = new ArrayList <Flight>();
		ArrayList <Booking> bookings = new ArrayList<Booking>();
		ArrayList <Customer> customers = new ArrayList<Customer>();
		Scanner select = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        
        //Initialize Menu
        Menu f1 = new Menu("Spicy Chicken Burger", 18);
        Menu f2 = new Menu("Grilled Beef        ", 22);
        Menu f3 = new Menu("Royal Cheesecake    ", 10);
        Menu f4 = new Menu("Salad Sandwich      ", 15);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(f1);
        menus.add(f2);
        menus.add(f3);
        menus.add(f4);
		
		//Initialize Flights
		flights.add(new Flight("Kota Kinabalu", "Senai", "12-07-2020", "10:30 - 15:50", 10));
		flights.add(new Flight("Senai", "Kota Kinabalu", "12-07-2020", "10:30 - 15:50", 10));
		
		
		do 
		{
			System.out.println("------------------------------------");
            System.out.println(":Flight Booking System : ");
            System.out.println("------------------------------------\n");
            System.out.println("Please Enter 1 to Display ");
			System.out.println("Please Enter 2 to Make Booking");
            System.out.println("Please Enter 3 to Cancel Booking");
            System.out.println("Please Enter 4 to Add Flight Schedule");
            System.out.println("Please Enter 5 to Check Customer Info"); 
            System.out.println("Please Enter 6 to Exit\n");
     
            System.out.print("Enter Option: ");
            option = select.nextInt();
        
            
            if(option == 1) {
            	//Display
        		for(int i = 0; i < flights.size(); i++) {
        			int list = i+1;
                		System.out.println("Flight Number: " + list);;
                    	System.out.println("From: " + flights.get(i).getDestination1());
                    	System.out.println("To: " + flights.get(i).getDestination2());
                        System.out.println("Time: " + flights.get(i).getTime());
                        System.out.println("Seat: " + flights.get(i).getSeat());
                    	System.out.println("\n");
        		}
            }
        	if(option == 2) {
        		//Booking
        		System.out.println("Book A Flight");
                System.out.println("-------------------------\n");
        		Random rnd = new Random();
        		int flightNumber = 1;
        		int bookingId = rnd.nextInt(9999);
        		
        		System.out.print("Enter Name: ");
            	String name = choice.nextLine();
            	System.out.print("Enter Email: ");
            	String email = choice.nextLine();
            	System.out.print("Enter Phone: ");
            	String phone = choice.nextLine();
            	
        		
        		Customer customer = new Customer(bookingId, name, email, phone);
        		customers.add(customer);
        		
        		Booking booking = new Booking(customer, flights.get(flightNumber-1));
        		bookings.add(booking);
        		
        		
        		flights.get(flightNumber-1).reservedSeat(); 
        		System.out.println( " Menu : ");
        	    System.out.println( "-------------------------");
        	    for (int i = 0; i < menus.size(); i++) {
        	       System.out.print(" [" + (i+1) + "] ");
        	       menus.get(i).printItem();
        	    }
        	    
        	    System.out.println("Choose 1 Menu: ");
        	    int selectedMenu = choice.nextInt();
        	    double flightFee = booking.getCost();
        	    double menuPrice = menus.get(selectedMenu-1).getprice();
        	    		
        	    double totalCost = flightFee + menuPrice;
                
                	System.out.println("Booking No. : " + customer.getId());
                	System.out.println("Total costs: " + totalCost + " Myr");
                	System.out.println();
                	
                	System.out.println("The seat is now reserved for you.");
        	}
        	
        	if(option==3) {
        		//Cancel
        		System.out.println("Cancel Booking");
                System.out.println("-------------------------\n");
                System.out.print("Enter the Booking No. :");
                int customerId = choice.nextInt();
                for (Customer customer : customers) {
                	if (customer.getId() == customerId)
                	{
                		for(Booking booking : bookings)
                		{
                			if (booking.getCustomer().getId() == customer.getId())
                			{
                				booking.getFlight().unreservedSeat();
                			}
                		}
                		System.out.println("Your reservation has been canceled!");
                	}
                }
                System.out.println();
        	}
        	
        	if(option==4) {
        		System.out.println("Add Flight Schedule");
				System.out.println("------------------------------\n");
				System.out.print("Enter From (eg:Kota Kinabalu): ");
				String from = choice.nextLine();
				System.out.print("Enter Destination (eg:Senai): ");
				String dest = choice.nextLine();
				System.out.print("Enter Date (eg:12-07-2020): ");
				String date = choice.nextLine();
				System.out.print("Enter Time (eg:10:30 - 15:50): ");
				String time = choice.nextLine();
				
				flights.add(new Flight(from, dest, date, time, 10));
        		
        	}
        	
        	if(option==5) {
        		//Check Customer Info
        		System.out.println("Check Customer Info");
                System.out.println("-------------------------\n");
                System.out.print("Enter the Booking No. : ");
                int customerId = choice.nextInt();
                for (Customer customer : customers) {
                	if (customer.getId() == customerId)
                	{
                		for(Booking booking : bookings)
                		{
                			if (booking.getCustomer().getId() == customer.getId())
                			{
                				booking.getCustomer().printCustomer();
                			}
                		}
                	}
                }
                System.out.println();
        	} 
        	
        	if(option==6)
            {
            System.out.print("\nThank You For Your Time, Have a good day!!");
            	System.exit(0);
            }

	}while(true);
}
}
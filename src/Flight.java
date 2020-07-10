
public class Flight {
	
	private String destination1;
	private String destination2;
	private String date;
	private String time;
    private int seat;
	
	//Constructor
	public Flight(String destination1, String destination2, String date, String time, int seat) {
		this.destination1 = destination1;
		this.destination2 = destination2;
		this.date = date;
		this.time = time;
        this.seat = seat;
	}
	
	//Mutator	
	public void setDestination1(String destination1) {
		this.destination1 = destination1;
	}
	
	public void setDestination2(String destination2) {
		this.destination2 = destination2;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
   
   public void setSeat(int seat){
      this.seat = seat;
   }
	
	//Accessor
	public String getDestination1()	{
		return destination1;
	}
	
	public String getDestination2()	{
		return destination2;
	}
	
	public String getDate()	{
		return date;
	}
	
	public String getTime()	{
		return time;
	}
   
   public int getSeat(){
      return seat;
   }
   
   public void reservedSeat() {
	   seat = seat - 1;
   }
   
   public void unreservedSeat() {
	   seat = seat + 1;
   }
   

}

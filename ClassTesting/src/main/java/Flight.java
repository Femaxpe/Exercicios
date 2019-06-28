public class Flight{
	
	int getSeats() { return 150; }
	
	/*public void add1Passenger(){
		if(hasSeating()) {
			passengers += 1;
		}
		else {
			handleTooMany();
		}
	}
	
	private boolean hasSeating() {
		return passengers < getSeats();
	}*/
	
	public void handleTooMany() {
		System.out.println("Too many passengers");
	}
	
}
public class TestInheritance{
	public static void main(String args []) {
		
		Flight f1 = new Flight();
		System.out.println(f1.getSeats());
		
		CargoFlight cf = new CargoFlight();
		System.out.println(cf.getSeats());
		
		Flight f2 = new CargoFlight();
		System.out.println(f2.getSeats());
	}
}
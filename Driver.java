import april_14.Flight;
import april_14.Passenger;
import april_14.VIPPassenger;

public class Driver {
	public static void main(String[] args) {
		Flight<Passenger> ecoflight = new Flight<Passenger>("A123");
		Passenger passenger1 = new Passenger("John");
		ecoflight.addPassenger(passenger1);

		Flight<Passenger> vipFlight = new Flight<Passenger>("B456");
		VIPPassenger passenger2 = new VIPPassenger("Alice");
		vipFlight.addPassenger(passenger2);

		System.out.println("Economy Flight: ");
		ecoflight.showPassengers();

		System.out.println("VIP Flight: ");
		vipFlight.showPassengers();
	}
}
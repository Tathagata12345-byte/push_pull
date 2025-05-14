
import java.util.ArrayList;

public class Flight<T> {
	private String flightNumber;
	private ArrayList<T> passengers;

	public Flight(String flightNumber) {
		this.flightNumber = flightNumber;
		this.passengers = new ArrayList<T>();
	}

	public void addPassenger(T passenger) {
		passengers.add(passenger);
	}

	public void showPassengers() {
		System.out.println("Flight: " + flightNumber);
		System.out.println(passengers);
	}
}

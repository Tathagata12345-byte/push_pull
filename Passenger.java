package ac;

public class Passenger {
	private String name;

	public Passenger(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Passenger: "+this.name;
	}

	public String getName() {
		return this.name;
	}
}

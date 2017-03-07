package Pset52.ship;

public class CruiseShip extends Ship {
	private int maximumPassengers;
	private boolean infected;

	public CruiseShip() {
		super();
	}

	public CruiseShip(String name, EngineType type, int year, int maxPassenger) {
		super(name, type, year);
		this.maximumPassengers = maxPassenger;
	}

	public int getMaximumPassengers() {
		return maximumPassengers;
	}

	public void setMaximumPassengers(int maximumPassengers) {
		this.maximumPassengers = maximumPassengers;
	}

	public boolean isInfected() {
		return infected;
	}

	public void setInfected(boolean infected) {
		this.infected = infected;
	}

	@Override
	public String toString() {
		return "CruiseShip [name=" + name + ", maximumPassengers=" + maximumPassengers + "]";
	}

}

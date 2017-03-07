package Pset52.ship;

public class CargoShip extends Ship {
	private double capacity;

	CargoShip() {
		super();
	}

	
	public CargoShip(double capacity) {
		this.capacity = capacity;
	}

	public CargoShip(String name, EngineType type, int year, double capacity) {
		super(name, type, year);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "CargoShip [name=" + name + ", capacity=" + capacity + "]";
	}

}

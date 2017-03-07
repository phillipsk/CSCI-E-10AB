package Pset52.ship;

public class ReeferVessel extends CargoShip {

	private boolean fullyRefrigerated;
	
	public ReeferVessel() {
		super();
	}

	public ReeferVessel(String name, EngineType type, int year, double capacity, boolean fullyRefrigerated) {
		super(name, type, year, capacity);
		this.fullyRefrigerated = fullyRefrigerated;
	}

	public boolean isFullyRefrigerated() {
		return fullyRefrigerated;
	}

	public void setFullyRefrigerated(boolean fullyRefrigerated) {
		this.fullyRefrigerated = fullyRefrigerated;
	}

	@Override
	public String toString() {
		return "ReferVessel [name=" + name + ", fullyRefrigerated=" + fullyRefrigerated + "]";
	}
}

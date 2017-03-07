package Pset52.ship;

abstract class Ship {
	String name;
	private EngineType type;
	private int year;

	Ship() {
		super();
	}

	Ship(String name, EngineType type, int year) {
		super();
		this.name = name;
		this.type = type;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EngineType getType() {
		return type;
	}

	public void setType(EngineType type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Ship [name=" + name + ", type=" + type + ", year=" + year + "]";
	}
}

enum EngineType {
	STEAM_ENGINE, STEAM_TURBINE, GAS_TURBINE, DIESEL, ELECTRIC, WIND, HUMAN_FORCE
}

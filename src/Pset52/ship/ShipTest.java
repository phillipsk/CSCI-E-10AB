package Pset52.ship;

public class ShipTest {
	public static void main(String[] args) {
		Ship[] ships = new Ship[]{
				new CruiseShip("MV Britannia", EngineType.ELECTRIC, 2015, 2800 ),
				new CruiseShip("Royal Princess", EngineType.ELECTRIC, 2013, 3600),
				new CargoShip("Emma Maersk", EngineType.DIESEL, 2006, 14770),
				new CargoShip("Barzan", EngineType.GAS_TURBINE, 2014, 18800),
				new ReeferVessel("Sweedish Reefer", EngineType.DIESEL, 1992, 13049 , false),
				new ReeferVessel("Atlantic Reefer", EngineType.STEAM_TURBINE, 1998, 14505, true) };

		for (Ship ship : ships) {
			System.out.println(ship.toString());
		}
	}
}

package model;

public class Audi extends Car {
	
	public Audi() {
		super();
	}

	@Override
	protected double getPollution(double km) {
		return (pollutionRate * km) /100;
	}
	/**
	 * The consumption rate is given for the highest gear of the car.
	 * Consumption increases with decreasing gear. For Audi the increase rate is 10%
	 */
	@Override
	protected double getFuelConsumption(int gear) {
		double consumption = 0;
		consumption = consumptionRate + consumptionRate*(numberOfGears-gear)/10;
		return consumption;
}

}

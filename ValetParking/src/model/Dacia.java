package model;

public class Dacia extends Car {
	
	public Dacia() {
		super();
	}
	
	@Override
	protected double getPollution(double km) {
		return (pollutionRate * km) /100;
	}
	/**
	 * The consumption rate is given for the highest gear of the car.
	 * Consumption increases with decreasing gear. For Dacia the increase rate is 20%
	 */
	@Override
	protected double getFuelConsumption(int gear) {
		double consumption = 0;
		consumption = consumptionRate + consumptionRate*(numberOfGears-gear)/5;
		return consumption;
}
	
}

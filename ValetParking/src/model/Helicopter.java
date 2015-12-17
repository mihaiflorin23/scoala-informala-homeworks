package model;

public class Helicopter extends Car {
	

	public Helicopter() {
		super();
		this.currentFuelAmount = 60;
	}
	
	@Override
	protected double getPollution(double km) {
		return (pollutionRate * km) /100;
	}
	
	@Override
	protected double getFuelConsumption(int gear) {
		double consumption = 0;
		consumption = consumptionRate + consumptionRate*(numberOfGears-gear)/5;
		return consumption;
}

}

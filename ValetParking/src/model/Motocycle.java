package model;

public class Motocycle extends Car {
	
	public Motocycle() {
		super();
		this.currentFuelAmount = 45;
	}
	
	@Override
	protected double getPollution(double km) {
		return (pollutionRate * km) /100;
	}
	

	@Override
	protected double getFuelConsumption(int gear) {
		double consumption = 0;
		consumption = consumptionRate + consumptionRate*(numberOfGears-gear)/10;
		return consumption;
}

}

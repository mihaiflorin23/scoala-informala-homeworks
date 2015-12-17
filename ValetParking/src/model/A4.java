package model;

public class A4 extends Audi{
	
	private static final double FUEL_TANK_CONST = 40;
	private static final double POLLUTION_RATE_CONST = 2;
	private static final double CONSUMPTION_RATE_CONST = 5.5;
	private static final int NUMBER_OF_GEARS_CONST = 6;
	private static final String[] FUEL_TYPE_CONST = {"PETROL", "DIESEL", "HYBRID", "ELECTRIC"};

	public A4(double availableFuel, String chassisNumber) {
		super();
	
		fuelTank = FUEL_TANK_CONST;
		consumptionRate = CONSUMPTION_RATE_CONST;
		pollutionRate = POLLUTION_RATE_CONST;
		numberOfGears = NUMBER_OF_GEARS_CONST;
		fuelType = FUEL_TYPE_CONST[2];
		if(availableFuel > fuelTank){
			System.out.println("The amount of fuel is too big");
			System.exit(0);
		}
		this.currentFuelAmount = availableFuel;
		this.chassisNumber = chassisNumber;

	}
	
	public String toString(){
		return "A4";
	}

}

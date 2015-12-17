package model;

public class Logan extends Dacia {
	
	private static final double FUEL_TANK_CONST = 50;
	private static final double POLLUTION_RATE_CONST = 3;
	private static final double CONSUMPTION_RATE_CONST = 4.7;
	private static final int NUMBER_OF_GEARS_CONST = 5;
	private static final String[] FUEL_TYPE_CONST = {"PETROL", "DIESEL", "HYBRID", "ELECTRIC"};

	public Logan(double availableFuel, String chassisNumber) {
		super();
	
		fuelTank = FUEL_TANK_CONST;
		consumptionRate = CONSUMPTION_RATE_CONST;
		pollutionRate = POLLUTION_RATE_CONST;
		numberOfGears = NUMBER_OF_GEARS_CONST;
		fuelType = FUEL_TYPE_CONST[0];
		if(availableFuel > fuelTank){
			System.out.println("The amount of fuel is too big");
			System.exit(0);
		}
		this.currentFuelAmount = availableFuel;
		this.chassisNumber = chassisNumber;

	}
	
	public String toString(){
		return "Logan";
	}

}

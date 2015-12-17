package model;
import java.util.Arrays;

public abstract class Car implements Vehicle{

	protected double fuelTank;
	protected String fuelType;
	protected int numberOfGears;
	protected double pollutionRate;
	protected double consumptionRate;
	protected double currentFuelAmount;
	protected String chassisNumber;
	protected final int[] gears = {1, 2, 3, 4, 5, 6};
	private double consumption;
	private double pollution;
	private int currentGear;
	private static double partialConsumption;
	/**
	 * The car is started, the current gear is 0 and the consumption and pollution are set to 0
	 */
	@Override
	public void start() {
		consumption = 0;
		pollution = 0;
		currentGear = 0;
		
	}
	/**
	 * The consumption is calculated according to the number of kilometers that the car is driven.
	 * The fuel consumption is given per 100km so the method calculates the value for the specific number of kilometers.
	 */
	@Override
	public void drive(double km) {
		
		partialConsumption = (getFuelConsumption(currentGear)*km)/100;
		consumption = consumption + partialConsumption;
		pollution = pollution + getPollution(km);
		currentFuelAmount = currentFuelAmount - partialConsumption;
		if(currentFuelAmount < 0){
			System.out.println("Fuel Amount = 0");
			System.exit(0);
		}
			
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped");
		
	}
	/**
	 * Shifts the gear of the car in a given gear
	 * If the given gear is not defined for that car a message will be displayed
	 * @param givenGear the new gear
	 */
	public void shiftGear(int givenGear){
		boolean contains = false;
		for(int i=0;i<gears.length;i++)
			if(gears[i] == givenGear)
				contains = true;
		if(!contains)
		{
			System.out.println("The gear doesn't exists");
			System.exit(0);
		}
		this.currentGear = givenGear;
	}
	/**
	 * Calculate the fuel consumption according to the current gear of the car
	 * @param gear the current gear of the car
	 * @return the fuel consumption of the car
	 */
	protected abstract double getFuelConsumption(int gear);
	/**
	 * Calculate the pollution rate of the car according to the number of kilometers that is driven.
	 * @param km the distance
	 * @return the pollution rate for the specific distance
	 */
	protected abstract double getPollution(double km);

	public double getConsumption() {
		return consumption;
	}


	public double getPollution() {
		return pollution;
	}
	
	public double getCurrentFuelAmount(){
		return currentFuelAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassisNumber == null) ? 0 : chassisNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(consumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(consumptionRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(currentFuelAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + currentGear;
		temp = Double.doubleToLongBits(fuelTank);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		result = prime * result + Arrays.hashCode(gears);
		result = prime * result + numberOfGears;
		temp = Double.doubleToLongBits(pollution);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pollutionRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (chassisNumber == null) {
			if (other.chassisNumber != null)
				return false;
		} else if (!chassisNumber.equals(other.chassisNumber))
			return false;
		if (Double.doubleToLongBits(consumption) != Double.doubleToLongBits(other.consumption))
			return false;
		if (Double.doubleToLongBits(consumptionRate) != Double.doubleToLongBits(other.consumptionRate))
			return false;
		if (Double.doubleToLongBits(currentFuelAmount) != Double.doubleToLongBits(other.currentFuelAmount))
			return false;
		if (currentGear != other.currentGear)
			return false;
		if (Double.doubleToLongBits(fuelTank) != Double.doubleToLongBits(other.fuelTank))
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (!Arrays.equals(gears, other.gears))
			return false;
		if (numberOfGears != other.numberOfGears)
			return false;
		if (Double.doubleToLongBits(pollution) != Double.doubleToLongBits(other.pollution))
			return false;
		if (Double.doubleToLongBits(pollutionRate) != Double.doubleToLongBits(other.pollutionRate))
			return false;
		return true;
	}
}
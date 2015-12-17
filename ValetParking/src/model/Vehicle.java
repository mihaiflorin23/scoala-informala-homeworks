package model;

public interface Vehicle {
	/**
	 * The vehicle starts
	 */
	public void start();
	/**
	 * The vehicle is driven for a given number of kilometers
	 * @param km the number of kilometers
	 */
	public void drive(double km);
	/**
	 * The vehicle stops
	 */
	public void stop();

}

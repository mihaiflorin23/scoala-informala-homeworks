package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.Logan;
import model.ParkingTicket;
import model.ValletParking;

public class TestValletParking {
	
	private ValletParking<Car> carPark;
	
	@Before
	public void setup() {
		carPark = new ValletParking<Car>();
	}
	
	@Test
	public void checkFuelConsumption() {
		Car car = new Logan(23, "sjdgfiad1134");
		double fuelBeforeParking = car.getCurrentFuelAmount();
		
		carPark.parkVehicle(car);
		
		double fuelAfterParking = car.getCurrentFuelAmount();

		Assert.assertTrue(fuelBeforeParking > fuelAfterParking);
		
	}
	
	@Test
	public void ckeckParkedVehicle(){
		Car car1 = new Logan(34, "sfiuawf123");
		carPark.parkVehicle(car1);
		Assert.assertFalse(carPark.getParking().isEmpty());

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void checkValidTicket(){
		Car car2 = new Logan(35, "sfiuawf12sad3");
		carPark.parkVehicle(car2);
		ParkingTicket t = new ParkingTicket();
		carPark.retrieveVehicle(t);
		
	}
	
	@Test
	public void ckeckRetriveVehicle(){
		Car carExpected = new Logan(15, "scfds456fgdg");
		ParkingTicket ticket = carPark.parkVehicle(carExpected);

		Car carActual = carPark.retrieveVehicle(ticket);
		Assert.assertEquals(carExpected, carActual);
	}
	
	@Test
	public void checkFuelAfterRetrive(){
		Car car4 = new Logan(22, "sjewr887dgfiad1");
	
		ParkingTicket ticket = carPark.parkVehicle(car4);
		double fuelAmount = car4.getCurrentFuelAmount();
		
		Car carActual = carPark.retrieveVehicle(ticket);
		
		double fuelAfterRetriving = carActual.getCurrentFuelAmount();
		Assert.assertTrue(fuelAmount > fuelAfterRetriving);
	}
	

}

package model;


public class CarsMain {

	public static void main(String[] args) {
		
		ValletParking<Car> carPark = new ValletParking<Car>();
		
		System.out.println("Dacia Logan: ");
		Car car = new Logan(23, "sjdgfiad1134");
		car.start();
		car.shiftGear(1);
		car.drive(10);
		car.shiftGear(2);
		car.drive(10);

		System.out.println("Dacia Sandero: ");
		Car car1 = new Sandero(19, "nnhsj123mmas");
		car1.start();
		car1.shiftGear(1);
		car1.drive(10);
		car1.shiftGear(2);
		car1.drive(10);
	
		System.out.println("Audi A4: ");
		Car car2 = new A4(15, "jsa7111hssbsm");
		Car a4 = (Car) car2;
		a4.start();
		a4.shiftGear(1);
		a4.drive(10);
		a4.shiftGear(4);
		a4.drive(10);
		
		System.out.println("Fuel before parking:");
		System.out.println("Logan:"+ car.currentFuelAmount);
		System.out.println("Sandero:"+ car1.currentFuelAmount);
		System.out.println("A4:"+ car2.currentFuelAmount);
		System.out.println();
		
		
		ParkingTicket ticket1 = carPark.parkVehicle(car);
		//ParkingTicket ticket2 = carPark.parkVehicle(car1);
		//ParkingTicket ticket3 = carPark.parkVehicle(car2);
		
		System.out.println("Fuel after parking:");
		System.out.println("Logan:"+ car.currentFuelAmount);
		System.out.println("Sandero:"+ car1.currentFuelAmount);
		System.out.println("A4:"+ car2.currentFuelAmount);
		
		Car retrivedCar = carPark.retrieveVehicle(ticket1);
		System.out.println("Car with the ticket:"+ retrivedCar.toString());
		
		System.out.println();
		
		Helicopter h = new Helicopter();
		System.out.println("Fuel before parking:");
		System.out.println("Helicopter:"+ h.currentFuelAmount);
		
		ValletParking<Helicopter> helicopterPark = new ValletParking<Helicopter>();
		ParkingTicket ticketHelicopter = helicopterPark.parkVehicle(h);
		
		System.out.println();
		System.out.println("Fuel after parking:");
		System.out.println("Helicopter:"+ h.currentFuelAmount);
		
		System.out.println();
		Car retriveH = helicopterPark.retrieveVehicle(ticketHelicopter);
		System.out.println("Helicopter:"+retriveH.toString());
		
		
	}
	
}

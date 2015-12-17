package model;
import java.util.Hashtable;


public class ValletParking<T extends Vehicle> {
	
	private  Hashtable<ParkingTicket, Car> h=new Hashtable<>();
	
	public ValletParking() {
	
	}
	
/**
 * Calculate the distance that the car is driven depending on the slot
 * @param slot the slot where the car is parked
 * @return the distance that the care is driven
 */
	public static int getDistanceForParking(int slot){
		int distance = 0;
		switch(slot){
			case 1:{
				distance = 20;
				break;
			}
				
			case 2:{
				distance = 30;
				break;
			}
			case 3:{
				distance = 40;
				break;
			}
			case 4:{
				distance = 50;
				break;
			}
			case 5:{
				distance = 60;
				break;
			}
		}
		return distance;
		
	}
	/**
	 * The car is driven for a distance to the slot and than is saved in a hashtable with ticket as key
	 * @param c the car that is parked
	 * @return the ticket 
	 */
	public ParkingTicket parkVehicle(Car c){
		
		ParkingTicket ticket = new ParkingTicket();
		
		int slot = ticket.getSlot();
		float distance = getDistanceForParking(slot);
		c.drive(distance);
		h.put(ticket, c);
		
		return ticket;
		
	}
	/**
	 * The car is got from the parking slot and is driven for the same distance
	 * @param ticket
	 * @return
	 * @throws IllegalArgumentException
	 */
	public Car retrieveVehicle(ParkingTicket ticket)throws IllegalArgumentException{
		
		if (!h.containsKey(ticket))
			throw new IllegalArgumentException("The ticket is not valid");
		
		Car c = h.get(ticket);
		int slot = ticket.getSlot();
		float distance = getDistanceForParking(slot);
		c.drive(distance);

		
		return c;
		
	}
	
	public Hashtable<ParkingTicket, Car> getParking(){
		return h;
		
	}
	

}

package model;
import java.util.Random;

public class ParkingTicket {
	
	private int ticketNumber;
	private int slot;
	Random rand = new Random();
	
	public ParkingTicket() {
		
		this.ticketNumber = rand.nextInt(1000) + 1000;
		this.slot = rand.nextInt(4) + 1;
	}
	
	public int getTicketNumber() {
		return ticketNumber;
	}

	public int getSlot() {
		return slot;
	}

}

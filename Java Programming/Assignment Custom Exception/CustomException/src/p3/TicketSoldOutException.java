package p3;

public class TicketSoldOutException extends Exception 
{
	@Override
	public String toString() {
		
		return "Sorry! Tickets are sold out....";
	}
}

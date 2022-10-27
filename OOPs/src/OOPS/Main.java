package OOPS;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		//System.in is a standard input stream    
        
        Ticket tic = new Ticket();	//Calling constructor method
	    
		System.out.println("Enter no of bookings:");
		int noOfBookings = sc.nextInt();
		
        System.out.println("Enter the available tickets:");
        int availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets); //setting availableTickets with user input
            
        do{	//do reprompt menu, while available ticket left more than 0
        	
	        System.out.println("Enter the ticketid:");
	        int ticketID = sc.nextInt();
	        tic.setTicketid(ticketID); //setting ticketID with user input
	        
	        System.out.println("Enter the price:");
	        int price = sc.nextInt();
	        tic.setPrice(price); //setting price with user input
	        
	        System.out.println("Enter the no of tickets:");
	        int noOfTickets = sc.nextInt();
	        
	        if (noOfTickets <= availableTickets) {
	        	System.out.println("Available tickets: " + Ticket.getAvailableTickets());	//get the amount of availableTickets from method
	        	//calculate "new" int amount using calculateTicketCost method
	        	//method includes getting new remaining availableTickets count
	        	int amount = tic.calculateTicketCost(noOfTickets);	
	        	if(amount ==-1) { //if amount return -1
	        		System.out.println("Tickets not sufficient / available");
	        	}else {
	        		System.out.println("Total amount:" + amount);
	        		System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());
	        	}
	        }
	    
        }while(Ticket.getAvailableTickets()>0); //do reprompt menu, while available ticket left more than 0
        
	    
        //Closing scanner
        sc.close();
	}

}

package OOPS;

public class Ticket {
	//Private Variables
    private int ticketid;
    private int price;
    private static int availableTickets;

    //Setter & Getter Methods
    //Ticket
    public void setTicketid(int ticketid)
    {
        this.ticketid = ticketid;
    }
    public int getTicketid()
    {
        return ticketid;
    }
    //Price
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    //Available Tickets
    public static void setAvailableTickets(int availableTickets)
    {
    	if(availableTickets < 0) { //user input should be greater than 0
    		System.out.println("Available Tickets should be greater than 0");
    	}else
    	Ticket.availableTickets = availableTickets;   
    }

    public static int getAvailableTickets()
    {
		return Ticket.availableTickets;
    }
    
    //Calculate ticket cost using (nooftickets) method
    //nooftickets is the parameter which value will be obtained by user input in Main.Java
    public int calculateTicketCost(int nooftickets)
    {
    	int availableTickets = getAvailableTickets();	// "new" int variable availableTickets = getAvailableTickets(); 
    	if(availableTickets < nooftickets)	// availableTickers less than user input for No Of Tickers
    		return -1;	//return -1
    	else {
    		int price = getPrice(); //get price from user setPrice
    		int available = availableTickets - nooftickets; //deduct the available tickets to find remaining tickets available
    		setAvailableTickets(available); //set the "new" remaining available tickets into setAvailableTickets
    		int amount = nooftickets*price; //calcualte ticket price based on nooftickets
    		return amount; //return calculated amount
    	}
    }   
}
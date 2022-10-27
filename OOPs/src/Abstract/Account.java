package Abstract;

public abstract class Account {
	
	//Attributes
	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
    
    //Uncomment the getters and setters after writing the attributes
	//Constructor
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	
	//Getters and Setters
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Abstract method
	public abstract boolean withdraw(double amount);
    
    
}   
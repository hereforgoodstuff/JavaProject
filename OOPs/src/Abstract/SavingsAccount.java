package Abstract;

public class SavingsAccount extends Account {
	//Attributes
	private double minimumBalance;
		
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

    //Uncomment the getters and setters after writing the attributes

    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public boolean withdraw(double amount) {
		if ((balance - amount) > minimumBalance) {
		    balance = balance - amount; //withdraw
			System.out.println("Balance after withdrawal:" + balance);
			return true;
		}else {
			System.out.println("Balance should not go below minimum balance");
		}
		return false;
	}  
}

    

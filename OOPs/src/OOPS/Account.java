package OOPS;

public class Account {
	//Private Variables
	private int accountId;
	private String accountType;
	private int balance;
	
	//Getter and Setter Methods		
	//AccountID
	public void setAccountId(int accid){
	    this.accountId = accid;
	}
	public int getAccountId() {
		return accountId;
	}	
	//Account Type
	public void setAccountType(String acctype){
	    this.accountType = acctype;
	}
	public String getAccountType() {
		return accountType;
	}	
	//Balance
	public void setBalance(int accbal){
	    this.balance = accbal;
	}
	public int getBalance() {
		return balance;
	}
	
	public boolean withdraw(int withdraw) {
		int availableBalance = getBalance();
		if (availableBalance < withdraw)
		{
			System.out.println("Sorry!!! No enough balance");
			return false;			
		}else {
			int deductedAmount = availableBalance - withdraw;
			System.out.println("Balance amount after withdraw: " + deductedAmount);
			return true;
		}	
	}
}

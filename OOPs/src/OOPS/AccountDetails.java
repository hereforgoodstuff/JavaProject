package OOPS;
import java.util.Scanner;
public class AccountDetails {
	//Create getAccountDetails method
	//all the user input will be captured here
	public static Account getAccountDetails() {
		Scanner sc= new Scanner(System.in);	
		Account account = new Account();
			
		System.out.println("Enter account's id:");
		int accid = sc.nextInt();
			
		System.out.println("Enter Account Type:");
		String acctype = sc.next();
			    
		System.out.println("Enter balance:");
		int accbal = sc.nextInt();
		//condition for checking accbal	    
		while (accbal <= 0) {
		System.out.println("Balance should be positive");
		System.out.println("Enter balance:");
		accbal = sc.nextInt();
	}
	//setting value for setter methods		
	account.setAccountId(accid);
	account.setAccountType(acctype);
	account.setBalance(accbal);
	//return all the values for account parameters		
	return account;
}
	//Create getWithdrawlAmount method
	public static int getWithdrawAmount() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn:");
		int withdraw = sc.nextInt();
		//condition for checking withdraw amount
		while (withdraw <= 0){
		System.out.println("Amount should be positive");
		System.out.println("Enter amount to be withdrawn:");
		withdraw = sc.nextInt();
	}
	return withdraw;
}
	//main method
	//new object account to get all parameters via getAccountDetials method
	//create new varialble for withdraw value to use
	//data type boolean used because method is boolean
	public static void main(String[] args) {
		Account account = getAccountDetails();
		int withdraw = getWithdrawAmount();
		boolean b = account.withdraw(withdraw);
	}
}
	
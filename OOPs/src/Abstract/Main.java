package Abstract;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter withdraw amount");
		double amount = sc.nextDouble();
		
		Customer customer = new Customer(2, "Dave", "dummy@gmail.com");
		
		SavingsAccount savingsaccount = new SavingsAccount(123456789, customer, 200.00, 50.00);
		
		boolean b = savingsaccount.withdraw(amount);
	}

}

package Polymorphism;

public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee e) {
		double loan = 0.0;
		if (e instanceof PermanentEmployee) {
			loan = e.getSalary() * 0.15;
		}
		else if (e instanceof TemporaryEmployee) {
			loan = e.getSalary() * 0.10;
		}
		return loan;
	}
}

package exceptionhandling;

public class InvalidSalaryException extends Exception { //extends Exception is just a class with exception, do not need to create a class for it
	
	public InvalidSalaryException() { //error message
		super("Registration Failed. Salary cannot be less than 10000.");
	}
	public InvalidSalaryException(String message) { //inherit from Exception Super class
		super(message);
	}
}

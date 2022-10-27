package exceptionhandling;

import java.util.Scanner;

public class Main {
	public static Candidate getCandidateDetails() throws InvalidSalaryException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Name:");
		String name = sc.next();
		
		System.out.println("Gender:");
		String gender = sc.next();
		
		System.out.println("Expected Salary:");
		double expectedSalary = sc.nextDouble();
		
		if (expectedSalary < 10000){ //if condition
			throw new InvalidSalaryException();
		}else {
			Candidate c = new Candidate();
        	c.setName(name);
        	c.setGender(gender);
        	c.setExpectedSalary(expectedSalary);
        	return c;
		}
	}

	public static void main(String[] args) {
		try {// try to open
		Candidate c = getCandidateDetails();	
		}catch (InvalidSalaryException e) { //e is an object of expcetion class
			System.out.println(e.getMessage());//get the exception message
		}	
	}

}

	


package Polymorphism;
import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
               
        System.out.println("Enter employeeid:");
        int employeeId = sc.nextInt();
        
        System.out.println("Enter employee name:");
        String employeeName = sc.next();
        
        System.out.println("Type of Employee (P/T):");
        char pt = sc.next().charAt(0);
        if(pt == 'P') {
        	System.out.println("Enter basic pay:");
            double basicPay = sc.nextDouble();
            PermanentEmployee e = new PermanentEmployee(employeeId, employeeName, basicPay);
            
            e.setEmployeeId(employeeId);
            e.setEmployeeName(employeeName);
            e.setBasicPay(basicPay);
            
            System.out.println("Employee Id: " + e.employeeId);
            System.out.println("Employee name: " + e.employeeName);
            System.out.println("Employee basic pay: " + e.getBasicPay());
            
            e.calculateSalary(); 
            
            Loan loan = new Loan();
            //must use double as method requires a double type return
            double peLoan = loan.calculateLoanAmount(e);
            System.out.println(peLoan);
		}
        
        if (pt == 'T') {
        	System.out.println("Enter hours worked:");
            int hoursWorked = sc.nextInt();
            
            System.out.println("Enter hourly wages:");
            int hourlyWages = sc.nextInt();
            
    		TemporaryEmployee e = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
    		
    		e.setEmployeeId(employeeId);
            e.setEmployeeName(employeeName);
    		e.setHoursWorked(hoursWorked);
    		e.setHourlyWages(hourlyWages);
    		
    		System.out.println("Employee Id: " + e.employeeId);
            System.out.println("Employee name: " + e.employeeName);
            System.out.println("Employee hours worked: " + e.getHoursWorked());
            System.out.println("Employee hourly wages: " + e.getHourlyWages());
            
            e.calculateSalary();
            
        	Loan loan = new Loan();
            double teLoan = loan.calculateLoanAmount(e);
            System.out.println(teLoan);
        }        
    }    
}
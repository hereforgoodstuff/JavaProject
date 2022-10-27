package OOPS;
import java.util.Scanner;
public class StudentMain{
		
	int studId;
	String studName;
	String studAddr;
	String yesno;
	String collName;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		//System.in is a standard input stream    
			
		System.out.println("Enter Student's Id:");
		int studId = sc.nextInt();
		
		System.out.println("Enter Student's Name:");
		String studName = sc.next();
		
		System.out.println("Enter Student's address:");
		String studAddr = sc.next();
		
		System.out.println("Whether the student is from NIT(Yes/No):");
		String yesno = sc.next();
				
		if (yesno.equalsIgnoreCase("no")){
			
			System.out.println("Enter the college name:");
			String collName = sc.next();
			Student student1 = new Student(studId, studName, studAddr, collName);
			
			student1.displayStudentNO();
		}
		else if(yesno.equalsIgnoreCase("yes")){
			Student student2 = new Student(studId, studName, studAddr);
			
			student2.displayStudentYES();
		}
		else
			System.out.println("Wrong Input");
		
		//Closing scanner
        sc.close();
	}

}


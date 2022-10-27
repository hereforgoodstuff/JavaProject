package contactdetails;
import java.util.Scanner;
public class Main extends Hosteller{
	
	public static Hosteller getHostellerDetails(){
		Scanner sc= new Scanner(System.in);	
		Hosteller hosteller = new Hosteller();
		
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int sid = sc.nextInt();
		
		System.out.println("Student Name");
		String sname = sc.nextLine();
		
		System.out.println("Department Id");
		int deptid = sc.nextInt();
		
		System.out.println("Gender");
		String gen = sc.next();
		
		System.out.println("Phone Number");
		String hpno = sc.next();
		
		System.out.println("Hostel Name");
		String hname = sc.next();
		
		System.out.println("Room Number");
		int rno = sc.nextInt();
		
		System.out.println("Modify Room Number(Y/N)");
		char mrnYN = sc.next().charAt(0);
		if(mrnYN == 'Y') {
			System.out.println("New Room Number");
			rno = sc.nextInt();
		}
		
		System.out.println("Modify Phone Number(Y/N)");
		char mpnYN = sc.next().charAt(0);
		if(mpnYN == 'Y') {
			System.out.println("New Room Number");
			hpno = sc.next();
		}
		hosteller.setStudentId(sid);
		hosteller.setName(sname);
		hosteller.setDepartmentId(deptid);
		hosteller.setGender(gen);
		hosteller.setPhone(hpno);
		hosteller.setHostelName(hname);
		hosteller.setRoomNumber(rno);
		return hosteller;
				
	}
	public static void main(String[] args) {
		Hosteller hosteller = getHostellerDetails();
		System.out.println("The Student Details");
		System.out.println(hosteller.studentId + " " + hosteller.name + " " + hosteller.departmentId + " " + 
		hosteller.gender + " " + hosteller.phone + " " + hosteller.getHostelName() + " " +  hosteller.getRoomNumber());
	}
}

package OOPS;

public class Student {
	//Private Variables
	private int studentId;
	private String studentName, studentAddress, collegeName;
	
	//Setter & Getter Methods
    //studentID
    public int getStudentId()
    {
        return studentId;
    }
    //Student Name
    public String getStudentName()
    {
        return studentName;
    }
    //Student Address
    public String getStudentAddress()
    {
        return studentAddress;
    }
    //College Name
    public String getCollegeName()
    {
        return collegeName;
    }
    
    public Student(int studId, String studName, String studAddr) {
        this.studentId = studId;
        this.studentName = studName;
        this.studentAddress = studAddr;
        this.collegeName = "NIT";
    }    
    public void displayStudentYES() {
    	System.out.println("Student id:" + getStudentId());
    	System.out.println("Student name:" + getStudentName());
    	System.out.println("Address:" + getStudentAddress());
    	System.out.println("College name:" + getCollegeName());
    	
    }
    public Student(int studId, String studName, String studAddr, String collName) {
        this.studentId = studId;
        this.studentName = studName;
        this.studentAddress = studAddr;
        this.collegeName = collName;
    }
    public void displayStudentNO() {
    	System.out.println("Student id:" + getStudentId());
    	System.out.println("Student name:" + getStudentName());
    	System.out.println("Address:" + getStudentAddress());
    	System.out.println("College name:" + getCollegeName());
    	
    }
}

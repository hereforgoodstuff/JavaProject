package contactdetails;

public class Student {
	protected int studentId;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected String phone;
	
	//Setter and Getter Methods
	//Student ID
	public void setStudentId(int sid) {
		this.studentId = sid;
	}
	public int getStudentId() {
		return studentId;
	}
	//Name
	public void setName(String sname) {
		this.name = sname;
	}
	public String getName() {
		return name;
	}
	//Department ID
	public void setDepartmentId(int deptid) {
		this.departmentId = deptid;
	}
	public int gettDepartmentId() {
		return departmentId;
	}
	//Gender
	public void setGender (String gen) {
		this.gender = gen;
	}
	public String getGender() {
		return gender;
	}
	//Phone
	public void setPhone(String hp) {
		this.phone = hp;
	}
	public String getPhone() {
		return phone;
	}
}

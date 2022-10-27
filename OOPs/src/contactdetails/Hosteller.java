package contactdetails;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	
	//Setter and Getter methods
	//Hostel Name
	public void setHostelName(String hname) {
		this.hostelName = hname;
	}
	public String getHostelName() {
		return hostelName;
	}
	//Room Number
	public void setRoomNumber(int rno) {
		this.roomNumber = rno;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
}

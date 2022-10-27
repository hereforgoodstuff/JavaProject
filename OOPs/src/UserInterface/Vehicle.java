package UserInterface;
public class Vehicle implements Loan, Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}

	public double takeInsurance() {
		double insurance;
		if (price <= 150000) {
			insurance = 3500;
			System.out.println("Amount inssured:" + insurance);
		}else if (price >= 150000 && price <= 300000) {
			insurance = 4000;
			System.out.println("Amount inssured:" + insurance);
		}else if (price > 300000) {
			insurance = 5000;
			System.out.println("Amount inssured:" + insurance);
		}else
			return 0;
		return insurance;
	}
	public double issueLoan() {
		double loan;
		
		if (vehicleType.equalsIgnoreCase("4 wheeler")) {
			loan = price * 0.8;
			System.out.println("Loan issued:" + loan);
		}else if (vehicleType.equalsIgnoreCase("3 wheeler")) {
			loan = price * 0.75;
			System.out.println("Loan issued:" + loan);
		}else if (vehicleType.equalsIgnoreCase("2 wheeler")) {
			loan = price * 0.5;
			System.out.println("Loan issued:" + loan);
		}else
			return 0;
		return loan;
	}
}

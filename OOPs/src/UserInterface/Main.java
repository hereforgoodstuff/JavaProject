package UserInterface;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Vehicle number:");
		String vehicleNumber = sc.next();

		System.out.println("Model:");
		String modelName = sc.next();

		System.out.println("Type:");
		String vehicleType = sc.nextLine();

		System.out.println("Price:");
		Double price = sc.nextDouble();

		Vehicle veh2 = new Vehicle(vehicleNumber, modelName, vehicleType, price);
		System.out.println("Vehicle number:" + veh2.getVehicleNumber());
		System.out.println("Vehicle model:" + veh2.getModelName());
		System.out.println("Vehicle type:" + veh2.getVehicleType());
		System.out.println("Price:" + veh2.getPrice());
		veh2.issueLoan();
		veh2.takeInsurance();
	}

}

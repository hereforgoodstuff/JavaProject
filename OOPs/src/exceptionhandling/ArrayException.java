package exceptionhandling;
import java.util.*;
public class ArrayException {
	
	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int [] arr = new int[n]; //create an new int array for "n" amount
		
		System.out.println("Enter price details");		
		
		for (int i = 0; i < n; i++) {			
			try {
				arr[i] = sc.nextInt(); //eg. for [n] = 5, user can only enter up to 5 inputs for [i]. as the array size is 6 [n] = 5
			}catch (InputMismatchException ignore) { // catch for inputmismatch, means int = string
				return "Input was not in the correct format"; //the price input must be only data type int
			}
		}	

		System.out.println("Enter the index of the array element you want to access");
		
		try {
			int index = sc.nextInt(); //let index be the position that user want to display from the array
			return "The array element is " + arr[index];
		}catch (InputMismatchException ignore) { // catch for inputmismatch, means int = string
			return "Input was not in the correct format";
		}catch (ArrayIndexOutOfBoundsException ignore) { // catch user input number bigger than initial array size
			return "Array index is out of range";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new ArrayException().getPriceDetails()); //new keyboard to initialize a new array
	}

}

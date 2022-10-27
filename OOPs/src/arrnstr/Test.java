package arrnstr;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("Enter total no. of emloyees:");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if (n >= 2) {
			int[] arr = new int[n];
			System.out.println("Enter the age for " + n + " employees:");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();// as long i < n, user can input next value up to max array size
			}
			for (int i = 0; i < n; i++)
				if (arr[i] >= 28 && arr[i] <= 40) {
					int sum = 0;
					for (int a : arr)
					sum = sum + a; // sum += a;
					double averageAge = (sum) / arr.length;
					System.out.println("The average age is: " + averageAge);
				}else
					System.out.println("Invalid age encountered!");
			}else
			System.out.println("Please enter a valid employee count");
	}

}
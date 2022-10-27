package Collection.ui;
import Collection.utility.*;
import java.util.*;

public interface UserInterface {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no of Policy names you want to store");
		int n = Integer.parseInt(sc.nextLine()); //why need to parseInt?
		
		//New TreeMap
		Bazaar bazaar = new Bazaar();
		bazaar.setPolicyMap(new TreeMap<>()); //Try to understand this later on
		
		//loop user input for "n" numeber of amount 
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Policy ID");
			int policyId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the Policy Name");
			String policyName = sc.nextLine();
			
			bazaar.addPolicyDetails(policyId, policyName); //call method to add into map
		}
		
		Map<Integer, String> policyMap = bazaar.getPolicyMap(); //create an object , get the data from getter method
		
		for (Map.Entry<Integer, String> policy : policyMap.entrySet()) {
			System.out.println(policy.getKey() + " " + policy.getValue());
		}
		
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine(); //input for searchBasedOnPolicyType method
		
		List<Integer> policies = bazaar.searchBasedOnPolicyType(policyType);
		
		for (int policy : policies) { //traverse. for object in list, print object.
			System.out.println(policy);
		}
	}
}

package Collection.utility;
import Collection.ui.*;
import java.util.*;

public class Bazaar {
	private Map<Integer,String> policyMap; //private map attribute, integer and string are like args for consturctor parameter.
	
	public Map<Integer, String> getPolicyMap() { //getter for policymap
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) { //setter for policymap
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName) //A map need key object and value object, hence, policyId and policyName
	{
		policyMap.put(policyId, policyName); //put is = add. key object, value object
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public List<Integer> searchBasedOnPolicyType(String policyType){ //search method based on policy type.
		List<Integer> policies = new ArrayList<>(); //create an integer arraylist
		
		for (int policyId : policyMap.keySet()) { //keyset is key object value, add to Arraylist.
			if (policyMap.get(policyId).contains(policyType)) { //so for each policyId that has policy type
				policies.add(policyId); // add into the ArrayList "policies"
			}
		}
			
		return policies; //return to display results.
		
	}
}

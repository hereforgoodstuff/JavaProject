package Collection;
import java.util.*;

@SuppressWarnings("unchecked")
public class UniqueWords {

	public static void main(String[] args) {
		ArrayList<String> studinput = new ArrayList<String>(); //new ArrayList
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Student's Article");
	    //user input string
		String article =sc.nextLine(); 
		// reg syntax format
		String symbol = "[,;:.?! ]+";
		// the new array will be filtered and stored into array
		String [] s = article.split(symbol);
		//count the array length and print
		int len = s.length;
		System.out.println("Number of words " + len);
		
		for (String words : s) {//for any element/obj that is in String[]s
			if(!studinput.contains(words.toLowerCase())) {//if the arraylist studinput does not contain the element/obj 
				studinput.add(words.toLowerCase()); // add input arraylist
				Collections.sort(studinput); //sort asec/desc
			}
		}

		//8
		int uniquewords = studinput.size();
		System.out.println("Number of unique words "+ uniquewords);
		//9 and 10
		System.out.println("The words are");
		for (String w : studinput) {
			System.out.println((studinput.indexOf(w)+1) + ". " + w);
		}
	}

}
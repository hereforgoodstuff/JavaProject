package arrnstr;
import java.util.Scanner;
public class Authority {
    public static void main(String[ ] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Inmate's name: ");
        String name = sc.nextLine();
        System.out.print("Inmate's father's name: ");
        String fname = sc.nextLine();
        
        //Use regex to check "A-Za-z" is for alphabets.
        // "\\s" is for space.
        //The "+" at the end of [A-Za-z\\s]+ means more than one occurrences are allowed.
        if (name.matches("[A-Za-z\\s]+") && fname.matches("[A-Za-z\\s]+")) {
            System.out.println(name.toUpperCase() + " " + fname.toUpperCase());
        } else if (!name.matches("[A-Za-z\\s]+")) {
            System.out.println("Invalid name");
        } else if (!fname.matches("[A-Za-z\\s]+")) {
            System.out.println("Invalid name");
        }
    }
}

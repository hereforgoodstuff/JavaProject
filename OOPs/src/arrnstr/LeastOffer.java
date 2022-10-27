package arrnstr;
import java.util.Scanner;
public class LeastOffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sc.nextLine() is added so user can enter all the input and still capture the int after the strings
        int n = sc.nextInt(); sc.nextLine();
        
        // n = user input, in this case 4 fixed, 3 = 4 data in array, 0,1,2,3
        String input1[][] = new String[n][3]; 
        
        //int i = 0
        //n = user input, in this case 4 fixed
        //i++ increment after each iteration
        for(int i=0;i<n;i++){//n = user input, in this case 4 fixed
          input1[i] = sc.nextLine().split(",");//max i<4 {input[i]} and reads all data {sc.nextLine(}) separated with comma {split(",")}.
          }
          //finding discount
          int discount[] = new int[n];//create a list of array for discount price
          for(int i=0;i<n;i++){//(Integer.parseInt(input1[i][1]) = price * discount = Integer.parseInt(input1[i][2])) /100
            discount[i] = (Integer.parseInt(input1[i][1])*Integer.parseInt(input1[i][2])/100);
          }
          //finding minimum discount
          int min=9999;
          for(int i=0;i<n;i++){
            if(min>discount[i]) min=discount[i];
          }
          //returning item with minimum discount
          for(int i=0;i<n;i++){
            if(min==discount[i]) System.out.print(input1[i][0]+" ");
          }
        }
}

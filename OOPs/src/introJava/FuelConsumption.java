package introJava;
import java.util.Scanner;
class Main{
    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream 
        int liter = sc.nextInt(); 
        System.out.println("Enter the no of liters to fill the tank");
        
        if (liter < 0 || liter == 0)
            System.out.println(liter + " is an Invalid Input");
            else {
                int distance = sc.nextInt(); 
                System.out.println("Enter the distance covered");
                if (distance < 0 || distance == 0)
                    System.out.println(distance + " is an Invalid Input");
                    else
                    {                  
                        double L = liter;
                        double D = distance;

                        System.out.println("Liters/100KM");

                        double consumptionCal = (L/D)*100;
                        System.out.format("%.2f", consumptionCal);
                        System.out.println();

                        double G = L*0.2642;
                        double M = D*0.6214;

                        System.out.println("Miles/gallons");

                        double convertedconsumptionCal = (M/G);
                        System.out.format("%.2f", convertedconsumptionCal);
                    }
            }
    }
}
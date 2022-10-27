package introJava;
import java.util.Scanner;
class Placement{
    public static void main (String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in CSE:");
        int ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int MECH = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        System.out.println("Testing");
        
        //Negative Input
        if (CSE<0 || ECE<0 || MECH<0)
        {
            System.out.println("Input is Invalid");
        }
        //None
        else if (CSE==ECE && CSE==MECH && MECH==ECE){
            System.out.println("None of the department has got the highest placement");
        }
        //CSE Highest
        else if (CSE>ECE && CSE>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        //ECE Highest
        else if(ECE>CSE && ECE>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        //MECH Highest
        else if(MECH>CSE && MECH>ECE)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        //CSE & MECH Highest
        else if (CSE>ECE && MECH>ECE && CSE==MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        //CSE & ECE Highest
        else if (CSE>MECH && ECE>MECH && CSE==ECE)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        //ECE & MECH Highest
        else if (ECE>CSE && MECH>CSE && ECE==MECH){
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        //ECE & CSE Highest
        else if (ECE>MECH && CSE>MECH && ECE==CSE)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("CSE");
        }
        //MECH & CSE Highest
        else if (MECH>ECE && CSE>ECE && MECH==CSE)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
            System.out.println("CSE");
        }
        //MECH & ECE Highest
        else if (MECH>CSE && ECE>CSE && MECH==ECE)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
            System.out.println("ECE");
        }
    }        
}
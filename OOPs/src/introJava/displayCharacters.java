package introJava;
import java.util.Scanner;  
class AsciValue{
    public static void main(String[] args){  
        System.out.println("Enter the digits:");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 
        for (int i = 0; i<4; i++){
            int value = sc.nextInt();
            System.out.println(value+"-"+(char)value);
        }
    }     
}  
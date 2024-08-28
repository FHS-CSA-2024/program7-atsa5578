//import stuff here
import java.util.*;
//Your code here
public class Program7{
    public static void main(String[] args){
        //integers
        double schruteBucks = 0;
        double klevins = 0;
        double stanleyBucks = 0;
        //scanner
        Scanner convert = new Scanner (System.in);
        //userInput
        System.out.println("Enter the schrute-bucks: ");
        schruteBucks = convert.nextInt();
        System.out.println("Enter the klevins: ");
        klevins = convert.nextInt();
        System.out.println("Enter the stanley-bucks: ");
        stanleyBucks = convert.nextInt();
        //formulas
        klevins = klevins * (1/20.0);
        schruteBucks = schruteBucks;
        stanleyBucks = stanleyBucks * (1/240.0);
        double total = (stanleyBucks + schruteBucks + klevins);
        
        //print
        System.out.println("----------------------------------");
        System.out.printf("Decimal schrute-bucks = " + "%.2f", total);
    }
}
//Paste console output below:
/*
Enter the schrute-bucks: 
7
Enter the klevins: 
17
Enter the stanley-bucks: 
9
----------------------------------
Decimal schrute-bucks = 7.89

*/

package MathClass;
//Math Method
import java.util.Scanner;
public class Main {
    public static void main(String[]OOP) {
        
       Methods math = new Methods();
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Please select function");
       System.out.println("A - Round Off number");
       System.out.println("B - Absolute number");
       System.out.println("C - Get maximum number");
       System.out.println("D - Get minimum number");
       System.out.print("Enter your choice: ");
       String choice = sc.nextLine();
       
       if (choice.equalsIgnoreCase("A")) {
           System.out.print("Enter a number: ");
           math.setRound(sc.nextDouble());
           
           math.getRound();
           
    } else if (choice.equalsIgnoreCase("B")) {
           System.out.print("Enter a number: ");
           math.setAbs(sc.nextDouble());
           
           math.getAbs();
           
    } else if (choice.equalsIgnoreCase("C")) {
           System.out.print("Enter first number: ");
           
           System.out.print("Enter second number: ");
           
           
           math.getMax();
        
    } else if (choice.equalsIgnoreCase("D")) {
        
        
    } else {
        System.out.println("Invalid Choice");
    }
    }
}


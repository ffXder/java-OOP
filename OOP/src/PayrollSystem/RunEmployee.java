package PayrollSystem;
//Run File
import java.util.Scanner;
public class RunEmployee {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Employee name = new Employee();
        
        System.out.print("Enter name: ");
        name.setName(sc.nextLine());
        
        System.out.println("Press F for Full Time or P for Part Time");
        String choice = sc.nextLine();
        
        if (choice.equalsIgnoreCase("F")) {
            FullTimeEmployee ft = new FullTimeEmployee();
            System.out.print("Enter monthly salary: ");
            ft.setMonthlySalary(sc.nextDouble());
            
            System.out.println("Name: " + name.getName() + "\n" 
                    + "Monthly Salary: " + ft.getMonthlySalary());
            
            
        } else if (choice.equalsIgnoreCase("P")) {
            PartTimeEmployee pt = new PartTimeEmployee();
            System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
            double rateperhour = sc.nextDouble();
            int hours = sc.nextInt();
            
            pt.setWage(rateperhour, hours);
            
            System.out.println("Name: " + name.getName() + "\n" + "Wage: " + pt.getWage());
           
        } else {
            System.out.println("Invalid Choice!");
        }
        
    }
}

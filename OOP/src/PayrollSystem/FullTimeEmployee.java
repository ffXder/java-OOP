package PayrollSystem;
//Child Class
public class FullTimeEmployee extends Employee {
    double monthlySalary;
    
    public FullTimeEmployee(){
        
    }
    //setters
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
}

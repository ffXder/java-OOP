package PayrollSystem;
//Child Class
public class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hours;
    double wage;
    
    public PartTimeEmployee(){
       
    }
    //setters
    public void setWage(double ratePerHour, int hours) {
        this.ratePerHour = ratePerHour;
        this.hours = hours;
       
    }
    //getters
    public double getWage(){
        return ratePerHour * hours;
    }

}

package Java;
/**
 *
 * @author fredd
 */
public class UnitConverter {
    int inch;
    double n1;
    double n2;
    double n3;
    
    private void convertFeetToInches(int inch){
        this.inch = inch;
    }
    public void setAverage(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //Exaple of Overloading
    public static double getAverage(double n1, double n2) {
        return n1;
    }
    public static double getAverage(double n1, double n2, double n3) {
        return n1;
    }
}

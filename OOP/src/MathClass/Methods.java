package MathClass;

public class Methods {
       
        double x;
        double y;
    public Methods() {
        
    }
    //setters
    public void setRound(double x){
        this.x = x;
    }
    public void setAbs(double x){
        this.x = x;
    }
    public void setMax1(double x){
        this.x = x;
    }
    public void setMax2(double y){
        this.y = y;
    }
    public void setMin1(double x){
        this.x = x;
    }
    public void setMin2(double y){
        this.y = y;
    }
    //getters
    public double getRound(){
        System.out.println("The round off number is " + Math.round(x) );
        return x;
    }
    public double getAbs(){
        System.out.println("The absolute number is " + Math.abs(x) );
        return x;
    }
    public double getMax(){
        System.out.println("The maximum number is " + Math.max(x,y) );
        return x;
    }
    public double getMin(){
        System.out.println("The maximum number is " + Math.min(x,y) );
        return x; 
    }
}

package Interface;
//child class
public class Motorcycle implements Vehicle {
        
    public void intro() {
        System.out.println("This is the attributes of Motorcycle");
    }
    public void vehicleType(String type){
        System.out.println("Motorcycle type is "+type);
    }
    public void vehicleModel(String model){
        System.out.println("Motorcycle model is "+model);
    }
    public void vehicleSpeed(int distance, int time){
        int speed = distance/time;
        System.out.println("Motorcyle speed is "+speed);
    }
}

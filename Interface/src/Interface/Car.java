package Interface;
//child class
public class Car implements Vehicle {
    
    public void intro() {
        System.out.println("This is the attributes of Car");
    }
    public void vehicleType(String type){
        System.out.println("Car type is "+type);
    }
    public void vehicleModel(String model){
        System.out.println("Car model is "+model);
    }
    public void vehicleSpeed(int distance, int time){
        int speed = distance/time;
        System.out.println("Car speed is "+speed);
    }
}

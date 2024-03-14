package Interface;

public class Main {
    public static void main(String[]args){
       Motorcycle motor = new Motorcycle();
       Car car = new Car();
       
       motor.intro();
       motor.vehicleType("Scooter");
       motor.vehicleModel("Yamaha Sniper 155");
       motor.vehicleSpeed(100,2);
       
       car.intro();
       car.vehicleType("SUV");
       car.vehicleModel("Mitsubishi Pajero");
       car.vehicleSpeed(100,5);
       
    }
}

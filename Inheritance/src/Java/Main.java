package Java;
public class Main {
    public static void main(String[]args) {
        Pet cat = new Pet();
        Fish fish = new Fish();
        cat.type = "Pusa";
        cat.name = "Orcat";
        
        cat.type();
        cat.name();
        cat.intro();
        
        fish.intro();
    }
}

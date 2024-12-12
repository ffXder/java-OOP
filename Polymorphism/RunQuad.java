import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println("- quarilateral");
    }
}

class Rectangle extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 right angles");
        super.showDescription();
    }
}

class Square extends Rectangle {
    public void showDescription() {
        System.out.println("- has 4 equal sides");
        super.showDescription();
    }
}

class Parallelogram extends Quadrilateral {
    public void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
        super.showDescription();
    }
}

class Rhombus extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 congruent sides");
        super.showDescription();
    }
}

class Trapezoid extends Quadrilateral {
    public void showDescription() {
        System.out.println(" - has 1 pair of parallel sides");
        super.showDescription();
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select from the following:");
        System.out.println("R - Rectangle\nS - Square\nP - Parallelogram\nH - Rhombus\nT - Trapezoid");
        String choices = input.nextLine().toUpperCase();

        switch (choices) {
            case "R" -> {
                Rectangle rectangle = new Rectangle();
                System.out.println("A rectangle:");
                rectangle.showDescription();
            }
            case "S" -> {
                Square square = new Square();
                System.out.println("A square:");
                square.showDescription();
            }
            case "P" -> {
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("A parallelogram:");
                parallelogram.showDescription();
            }
            case "H" -> {
                Rhombus rhombus = new Rhombus();
                System.out.println("A rhombus:");
                rhombus.showDescription();
            }
            case "T" -> {
                Trapezoid trapezoid = new Trapezoid();
                System.out.println("A trapezoid:");
                trapezoid.showDescription();
            }
        }
        input.close();

    }
}
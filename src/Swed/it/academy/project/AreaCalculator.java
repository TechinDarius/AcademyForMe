package Swed.it.academy.project;

import java.util.Scanner;

import static Swed.it.academy.project.InputOutputManager.scan;
import static Swed.it.academy.project.InputOutputManager.userChoice;

public class AreaCalculator {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        while (true) {
            userChoice();
            errors();
            result();
            Scanner scan = new Scanner(System.in);
            System.out.println("Continue? Y/N");
            String answer = scan.nextLine();
            if (answer.equals("N")||answer.equals("n")) {
                System.out.println("Closing. \nCiao!");
                break;
            }
        }

    }

    public static void errors() {
        try {
            InputOutputManager.dataInput();
        } catch (UnknowShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void result() {
        Shape shape =
                switch (InputOutputManager.getShape()) {
                    case 1 -> {
                        yield new Square(InputOutputManager.getData1());
                    }
                    case 2 -> {
                        yield new Triangle(InputOutputManager.getData1(), InputOutputManager.getData2());
                    }
                    case 3 -> {
                        yield new Circle(InputOutputManager.getData1());
                    }
                    default -> {
                        yield null;
                    }
                };
        if (shape != null) {
            shape.area();
            InputOutputManager.printCalculatedArea(shape.toString());
        }
    }
}












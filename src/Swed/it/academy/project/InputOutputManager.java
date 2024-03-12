package Swed.it.academy.project;

import java.util.Scanner;

public class InputOutputManager {
    static final Scanner scan = new Scanner(System.in);

    private static int choseShape;
    private static int data1;
    private static int data2;

    public static int getShape() {
        return choseShape;
    }

    public static int getData1() {
        return data1;
    }

    public static int getData2() {
        return data2;
    }

    public static void userChoice() {
        System.out.println("Chose shape (1 for square, 2 for triangle, 3 for circle): ");

        choseShape = scan.nextInt();
    }

    public static void dataInput() throws UnknowShapeException {
        switch (choseShape) {
            case 1:
                System.out.println("Set length of square side: ");
                data1 = scan.nextInt();
                break;
            case 2:
                System.out.println("Set length of one side: ");
                data1 = scan.nextInt();
                System.out.println("Set length of one side: ");
                data2 = scan.nextInt();
                break;
            case 3:
                System.out.println("Set radius: ");
                data1 = scan.nextInt();
                break;
            default:
                //scan.close();
                throw new UnknowShapeException("I dont know such shape! Enter 1 for square, 2 for triangle, 3 for circle");
        }
        //scan.close();
    }
    public static void printCalculatedArea(String shape){
        System.out.println(shape);
        System.out.println("--------------------------------------------------------");
    }

}
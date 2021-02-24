package TcsCodingQuestions;

import java.util.*;

public class Program5 {
    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        return number;
    }

    // method for floating number validation
    // public static float[] inputValidationf(Scanner sc1) {
    // float i;
    // do {
    // System.out.println("Enter Floting point Number: ");
    // while (!sc1.hasNextFloat()) {
    // System.out.println("This is not a floating point number.Please Enter floating
    // point number:");
    // sc1.next();
    // }
    // i = sc1.nextFloat();
    // } while (i >= 2536.2558);
    // System.out.println("The floating point number: " + i);
    // return i;

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nunber of Interior walls :: ");
        int numberOfInteriorWalls = inputValidation(sc);

        System.out.println("Enter number of exterior walls :: ");
        int numberOfExteriorWalls = inputValidation(sc);// input validation

        Scanner sc1 = new Scanner(System.in);
        float[] areaOfInteriorWall = new float[numberOfInteriorWalls];
        float areaOfExteriorWalls[] = new float[numberOfExteriorWalls];
        // Intilizing the input values for area of interior and Exterior surface area
        System.out.println("Eneter te surface area  of the interior walls :: ");
        for (int i = 0; i < numberOfInteriorWalls; i++) {
            areaOfInteriorWall[i] = sc.nextFloat();// taking input of measurmrnts
        }
        System.out.println("Enter the surface area of the exterior walls :: ");
        for (int i = 0; i < numberOfExteriorWalls; i++) {
            areaOfExteriorWalls[i] = sc.nextFloat();// taking input of measurmrnts
        }
        double costOfPainting = 0;// intlizing the cost to 0 to add
        float interiorPaint = 18, exteriorPainting = 12;// given values of interior and extyerior paints

        if (numberOfInteriorWalls <= 0 || numberOfExteriorWalls <= 0) {// if walls are 0 then invalid
            System.out.println("Invalid numer of walls was taken");
        } else {
            for (int i = 0; i < areaOfInteriorWall.length; i++) {// adding the cost of paint of unterior wall
                costOfPainting += interiorPaint * areaOfInteriorWall[i];
            }
            for (int i = 0; i < areaOfExteriorWalls.length; i++) {// adding the cost of paint of exterior wall
                costOfPainting += exteriorPainting * areaOfExteriorWalls[i];
            }
            System.out.println("Toatal Estimated cost of Paninting is :: " + costOfPainting + "INR");
        }
        sc.close();
        sc1.close();

    }

}

package TcsCodingQuestions;

import java.util.*;

public class Program17 {
    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static float inputValidationf(Scanner sc) {
        float i;
        do {
            System.out.println("Enter Floting point Number: ");
            while (!sc.hasNextFloat()) {
                System.out.println("This is not a floating point number.Please Enter floating point number:");
                sc.next();
            }
            i = sc.nextFloat();
        } while (i >= 2536.2558);
        System.out.println("The floating point number: " + i);
        return i;
    }

    public static void addition(int number1, int number2) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr Number1 : ");
        int number1 = inputValidation(sc);
        System.out.println("Enter number 2 : ");
        float number2 = inputValidationf(sc);

        float sum = number1 + number2;

        System.out.println("sum = " + sum);

    }

}

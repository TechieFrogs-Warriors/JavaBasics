package PracticeCoddingQuestions;

import java.util.*;

public class Program3 {
    // method for input validation
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :: ");
        int number = inputValidation(sc);// validating the input

        // converting to binary
        System.out.println("convertion for decimal to binary :: ");
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);

        // converting to Octal
        System.out.println("Converting from decimal to Octal :: ");
        String octal = Integer.toOctalString(number);
        System.out.println(octal);

        // converting to hexadecimal
        System.out.println("Converting decimal to hexa decimal :: ");
        String hexadecimal = Integer.toHexString(number);
        System.out.println(hexadecimal);
    }

}

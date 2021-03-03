package PracticeCoddingQuestions;

import java.util.*;

public class Program10 {
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
        int number = inputValidation(sc);// valiating the number

        isBinaryOrNot(number);// calling the isBinary method

    }

    // method to check number id binary number or not

    static void isBinaryOrNot(int number) {
        boolean isBinary = true;

        int copyOfNumber = number;

        while (copyOfNumber != 0) {// iterates till the number is 0
            int temp = copyOfNumber % 10; // Gives last digit of the number

            if (temp > 1) {// last digit in a number greater than 1 then resturn flase
                isBinary = false;
                break;
            } else {
                copyOfNumber = copyOfNumber / 10; // Removes last digit from the number
            }
        }

        if (isBinary) {
            System.out.println(number + " is a binary number");
        } else {
            System.out.println(number + " is not a binary number");
        }
    }

}

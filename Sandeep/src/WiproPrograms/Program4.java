package WiproPrograms;

import java.util.*;

public class Program4 {
    public static int number;

    // input validation
    // validation method
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr bar code number : ");
        number = inputValidation(sc);// input validation

        int small = 9;
        while (number != 0) {
            int reminder = number % 10;// returnd reminder i.e last digit in anumber

            small = Math.min(reminder, small);// finds the smallest value
            number = number / 10;// returns quefient i.e gives the number excpt last digit

        }
        System.out.println("The Old product id is : " + small);

    }
}

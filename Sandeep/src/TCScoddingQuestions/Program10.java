package TCScoddingQuestions;

import java.util.*;

public class Program10 {
    // validation for input string
    public static String inputValidtionS(Scanner sc) {
        String word;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[0-9]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            word = sc.nextLine();
        } while (word.equals(""));
        return word;
    }

    // validation fo input integer
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

    // Driver class
    public static void main(String[] args) {
        // reading user input and validating them
        Scanner sc = new Scanner(System.in);

        // reading the number system Y (base) by user
        System.out.println("Enter Y base value");
        int y = inputValidation(sc);// input validation

        // reading the divisor k from user
        System.out.println("Enter K  number");
        int k = inputValidation(sc);// input validation

        // reading the number to be divided from user
        System.out.println("Enter  X Alice string ");
        String x = inputValidtionS(sc);// input validation

        int permutations = divisibleK(y, k, x);// calling method divisibleK
        System.out.println("Number of permutations mare  :: " + permutations);

    }

    // Logic method to check if decimal number is divisible by 'k' or not ,if its
    // divisible return permutation(quotient)
    public static int divisibleK(int y, int k, String x) {

        int len = x.length(); // length of string

        // converting string to integer
        int aliceNumber = Integer.parseInt(x);

        // calling decimal conversion method to get number in decimal format
        int output = decimalConversion(aliceNumber, len, y);

        // checking if decimal number recieved is divisible by 'k' value given by user
        if (output % k == 0) {
            return output / k; // if true return permutation(quotient)
        }

        // If not divisible by 'k'
        else {
            // reversing the number
            int remainder = 0, rev = 0;
            while (aliceNumber != 0) {
                remainder = aliceNumber % 10;

                rev = (rev * 10) + remainder;

                aliceNumber = aliceNumber / 10;
            }
            // again calling decimal conversion method
            output = decimalConversion(rev, len, y);

            // if divisible return permutation(quotient)
            if (output % k == 0) {
                return output / k;
            }

            // If totally not divisible
            else {
                return 0;
            }
        }

    }

    // method for converting any number system to decimal system
    public static int decimalConversion(int n, int len, int y) {
        int temp = 0;
        int result = 0;
        // loop to conversion to decimal system
        for (int i = 0; i < len; i++) {
            temp = n % 10;
            result = result + (temp * (int) Math.pow(y, i));
            n = n / 10;
        }
        // Returning number in decimal format
        return result;

    }
}

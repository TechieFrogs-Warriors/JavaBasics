package TcsCodingQuestions;

import java.util.*;

public class Program12 {
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
        } while (number < 0);

        return number;
    }

    public static void check(int number) {
        int i = 1, count = 0;// intilizing the i to 1 and count to 0
        // prime number code
        while (i <= number) {// loop itertares till the i values is less than the taken number
            if (number % i == 0) {
                count++;// count willbw incremented whwn mod is equal to 0
            }
            i++;
        }
        if (count == 2) {// if count is 2 then the number is prime
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :: ");
        int number = inputValidation(sc);

        check(number);// calling method to verify wether given numer is palindrome or not
    }

}

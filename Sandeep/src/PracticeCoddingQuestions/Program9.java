package PracticeCoddingQuestions;

import java.util.*;

public class Program9 {
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

        reverseAdd(number);// calling the method
    }

    // method to reverse and add the number it self untill you get a number
    static void reverseAdd(int number) {
        if (checkPalindrome(number)) {// if palindrome
            System.out.println("Given Number is already a palindrome");
        } else {// if not palindrome
            while (!checkPalindrome(number)) {// till the number is palindrome this loop iterates
                int reverse = reverseNumber(number);// calls the reverse method to reverse the number

                int sum = number + reverse;

                System.out.println(number + " + " + reverse + " = " + sum);

                number = sum;
            }
        }
    }
    // Method To Reverse A Number

    static int reverseNumber(int number) {
        int reverse = 0;

        int rem = 0;

        while (number != 0) {// reversing the number
            rem = number % 10;

            reverse = (reverse * 10) + rem;

            number = number / 10;
        }

        return reverse;
    }
    // Method To Check For Palindrome

    static boolean checkPalindrome(int number) {
        int reverse = reverseNumber(number);

        if (reverse == number) {// if revsrse and number are equal then true
            return true;
        } else {
            return false;// if number and reverse are no treu then return false
        }
    }

}

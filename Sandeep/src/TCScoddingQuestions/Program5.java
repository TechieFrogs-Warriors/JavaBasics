package TCScoddingQuestions;

import java.util.*;

public class Program5 {
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

        // Taking Number as string input
        System.out.println("Enter your string of digits");
        String word = inputValidtionS(sc);

        // converting string to integer value
        int Number = Integer.parseInt(word);

        // to delete k digits from the input number
        int k = inputValidation(sc);

        // calling method that finds the smallest number after deleting k digits from it
        int newNum = smallestNum(Number, k);

        // printing the output
        System.out.println(newNum);

    }

    // Method that performs logic and returns smallest integer
    public static int smallestNum(int word, int k) {
        // loop to remove k digits from the given number
        for (int i = 0; i < k; i++) {
            word = word / 10;

        }

        // doing modulo division 10^9+7
        word = (int) (word % (Math.pow(10, 9) + 7));

        // return final integer value

        return word;

    }

}

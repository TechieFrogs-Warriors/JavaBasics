package TcsCodingQuestions;

import java.util.*;

public class Program1 {
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
        int number = inputValidation(sc);// input validation

        int N = 10, k = 5;// intilizing the values according to the given Question

        if (number >= 1 && number <= k) {// if the input is betwwen the 1 and the k value then this condition is excuted
            System.out.println("Number of candles sold is :: " + number);
            int candlesavilable = N - number;
            System.out.println("Number of candles avilable in a jar is :: " + candlesavilable);
        } else {// if the conditionn is less than 1 and greater than k value ten this condition
                // is excuted
            System.out.println("Invalid Input");
            System.out.println("Number of candles left is :: " + N);
        }
        sc.close();

    }

}

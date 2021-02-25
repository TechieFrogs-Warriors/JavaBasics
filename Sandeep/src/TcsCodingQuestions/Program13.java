package TcsCodingQuestions;

import java.util.*;

public class Program13 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number you want :: ");
        int number = inputValidation(sc);
        // loop interates untill the the Nth time
        int oddterm = 0, eventerm = 0;// intilizing the x and y zero
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0)// if even then 6 added
            {
                eventerm += 6;
                // System.out.print(eventerm + " ");
            } else// if odd 7 is added
            {
                oddterm += 7;
                // System.out.print(oddterm + " ");
            }

        }
        if (number % 2 == 0)// printing the nth even number
        {
            System.out.println(number + " th term of the series is :: " + eventerm);
        } else// printing the nth odd number
        {
            System.out.println(number + " th tern of the series is :: " + oddterm);
        }
    }

}

package TcsCodingQuestions;

import java.util.*;

public class Program15 {
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

        System.out.println("Enetr a numebr :: ");
        int number = inputValidation(sc);
        int evenoder = 0, oddoder = 0;

        if (number < 20000) {
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0)// if even then +2 is add every time
                {
                    evenoder += 2;
                } else// if odd then +1 is added every time
                {
                    oddoder += 1;
                }
            }
            if (number % 2 == 0)// if number even then this condtion is excuted
            {
                System.out.println(number + " th term of the series is :: " + (evenoder - 2) / 2);
            } else// if number is odd then this condition is excuted
            {
                System.out.println(number + " th term of the series is :: " + (oddoder - 1) / 2);
            }

        } else {
            System.out.println("Range should not excceed 20000");
        }
    }

}

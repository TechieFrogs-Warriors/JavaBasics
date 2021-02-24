package TcsCodingQuestions;

import java.util.*;

public class Program19 {
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
        System.out.println("enter number :: ");
        int number = inputValidation(sc);// input validating

        // logic for series
        int nthterm = 0;// intilizing the nth tern to 0
        while (number > 0) {
            nthterm++;
            if (nthterm == 1)// if nth ternm is 1 then decremnt the number
            {
                number--;
            }
            if (nthterm % 2 == 0 || nthterm % 3 == 0 || nthterm % 5 == 0)// if nth term is divided by 2 or 3 or 5 then
                                                                         // decremnt the number
            {
                number--;
            }
        }
        System.out.println(nthterm);
    }
}

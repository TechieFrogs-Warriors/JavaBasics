package TcsCodingQuestions;

import java.util.*;

public class Program14 {
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
        int number = inputValidation(sc);// validating the input

        int oddterm = 1, eventerm = 1;// intilizing the values to 1 as the series start from 1

        if (number < 30) {

            for (int i = 1; i <= number + 1; i++) {
                if (i % 2 == 0) {
                    eventerm *= 3;// multing the nuber with 2 each time when its a even
                    System.out.print(eventerm + " ");
                } else {
                    oddterm *= 2;// multipying the number with 3 each time when its a odd
                    System.out.print(oddterm + " ");
                }
            }
            if (number % 2 == 0) {
                System.out.println("\n" + eventerm / 3);// as in series 1 as not printing to achive the corrct dividing
                                                        // the values by even value by 3
            } else {
                System.out.println("\n" + oddterm / 2);// as in series 1 as not printing to achive the corrct dividing
                                                       // the values by odd value by 2
            }
        } else {
            System.out.println("Number should not Excedded 30");
        }

    }

}

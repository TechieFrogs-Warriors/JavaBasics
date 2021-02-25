package TcsCodingQuestions;

import java.util.*;

public class Program20 {
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
        System.out.println("Enter Range1 :: ");
        int range1 = inputValidation(sc);// validaing the input

        System.out.println("Enter range2 :: ");
        int range2 = inputValidation(sc);// validating the input

        if (range1 > range2) {// if range 1 is greater than rang2 ten its a wrong input
            System.out.println("Worng input");
        } else if (range1 <= 0 || range2 <= 0) {
            System.out.println("Wrong input");
        } else {
            for (int i = range1; i < range2; i++) {// loop iterates from the range1 to range2
                int num, reminder, sum = 0;
                num = i;
                while (num != 0) {
                    reminder = num % 10;// geting reminder i.e last digit in a number
                    sum += (reminder * reminder * reminder);
                    num /= 10;// getting quficinet excpt the last digit in anuber getting the raminining
                              // digits
                }
                if (sum == i) {// if the sum and the ith vaue is smae then its said to be Armstring number
                    System.out.println(i);
                }
            }
        }

    }

}

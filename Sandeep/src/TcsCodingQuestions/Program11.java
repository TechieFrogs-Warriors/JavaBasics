package TcsCodingQuestions;

import java.util.*;

public class Program11 {
    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            // System.out.println("enter Postive Number: ");
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
        System.out.println("Eneter year :: ");
        int year = inputValidation(sc);

        boolean leapyear = false;// intaly assiging the leap year to false

        if (year % 4 == 0)// If it is not divisible by 4 then it is not a leap year.
        {
            if (year % 100 == 0)// If it is not divisible by 100 then it is a leap year.
            {
                if (year % 400 == 0)// If it is not divisible by 400 then it is a leap year.
                {
                    leapyear = true;
                } else {
                    leapyear = false;
                }
            } else {
                leapyear = true;
            }
        } else {
            leapyear = false;
        }
        if (leapyear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not a leap year");
        }

    }
}

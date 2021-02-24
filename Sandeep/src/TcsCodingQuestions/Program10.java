package TcsCodingQuestions;

import java.util.*;

public class Program10 {
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
        System.out.println("Enter the number patence visyed today :: ");
        int numberOfPatience = inputValidation(sc);// input validation

        System.out.println("Enter the ages of patence visted :: ");
        int ageOfPatences[] = new int[numberOfPatience];// intilizing the array to store the patence ages
        for (int i = 0; i < ageOfPatences.length; i++) {
            ageOfPatences[i] = inputValidation(sc);// intilizing the patience ages
        }
        int fees = 0;// intilizing the fees to 0
        for (int i = 0; i < ageOfPatences.length; i++) {
            if (ageOfPatences[i] <= 17) {// if age is less than 17 then this condtion excuted
                fees += 200;
            } else if (ageOfPatences[i] > 17 && ageOfPatences[i] < 40) {// if age is gretaer than 17 and less than 40
                                                                        // this condition is excuted
                fees += 400;
            } else {// if ages is greater than 40 hen this condition is excuted
                fees += 300;
            }

        }
        System.out.println("Total Income " + fees + " INR");

    }

}

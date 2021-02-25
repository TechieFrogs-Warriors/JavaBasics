package TcsCodingQuestions;

import java.util.*;

public class Program3 {
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

    public static void time(int weight) {
        if (weight == 0) {// if the input weight taken is 0 than this condition is excutes
            System.out.println("Time Estimated is :: 0 minutes");
        } else if (weight > 0 && weight <= 2000) {// if the input weight taken is between 0 to 2000 than this condition
                                                  // is excutes
            System.out.println("Time Estimates is :: 25 minutes");
        } else if (weight > 2000 && weight <= 4000) {// if the input weight taken is above 200 to 4000 than this
                                                     // condition is excutes
            System.out.println("Time Estimates is :: 35 minutes");
        } else if (weight > 4000 && weight <= 7000) {// if the input weight taken is above 4000 to 7000 than this
                                                     // condition is excutes
            System.out.println("Estmiated time is :: 45 minutes");
        } else {// if the input weight taken is excedded the 7000 than this condition is excutes
            System.out.println("Invlid Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight of the machine :: ");
        int machineweight = inputValidation(sc);// validating the input

        time(machineweight);// calling the satic method

        sc.close();

    }

}

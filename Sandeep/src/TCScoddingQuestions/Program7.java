package TCScoddingQuestions;

import java.util.*;

public class Program7 {
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
        System.out.println("enter the size of array :: ");
        int N = inputValidation(sc);// input validation

        // intilizing the elemnts into the array
        System.out.println("enter data in array ");
        int[] ATM = new int[N];
        for (int i = 0; i < N; i++) {
            ATM[i] = inputValidation(sc);// input validation
        }

        // enter the amount to withdrwal the amount
        System.out.println("Enter amount to withdrawal :: ");
        int X = inputValidation(sc);

        // code for the calculating the total amount of cash available in ATM
        int totalAmount = 0;
        for (int i = 0; i < ATM.length; i++) {
            totalAmount += ATM[i];
        }

        // checking the codition for the withdrawal if amount eneted is less than the
        // total amount or not in ATM
        System.out.println(withDraw(X, totalAmount));

    }

    // method for checking the enterd amont is lager than or smaller than the total
    // amount in ATM
    public static int withDraw(int X, int totalAmount) {
        if (X > totalAmount)// if the withdrawal amont is greatrn than avilable amount them it returns -1
            return -1;
        else
            return 0;

    }
}

package TCScoddingQuestions;

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
        System.out.println("Enter number of mathematics books :: ");
        int n = inputValidation(sc);// input validation

        System.out.println("Enter number of chemisrthy books :: ");
        int m = inputValidation(sc);// input validation

        System.out.println("Enter number of Science books :: ");
        int k = inputValidation(sc);// input validation
        System.out.println("number of science books nedded :: ");
        int x = inputValidation(sc);// input validation

        // coding for the mathematics book
        int rM = 1;// number of book you want
        int combinationM = fact(n) / (fact(n - rM) * fact(rM));

        // coding for chemisrty book
        int rC = 2;
        int combinationC = fact(m) / (fact(m - rC) * fact(rC));

        // codding for Secience book
        int combinationS = fact(k) / (fact(k - x) * fact(x));

        int result = combinationC * combinationM * combinationS;// multipying th eall the values
        System.out.println("\n\n" + result);

    }

    // methd to find the facorial of the numbers
    public static int fact(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

}

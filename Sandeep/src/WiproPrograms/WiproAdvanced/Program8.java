package WiproPrograms.WiproAdvanced;

import java.util.*;

public class Program8 {
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

        // intilizing the N
        System.out.println("Enter the number of starircase :: ");
        int N = inputValidation(sc);// validating the input

        System.out.println("Number of ways can climb the star case is :: " + countWays(N));

    }

    public static int countWays(int N) {
        return fibnoc(N + 1);
    }

    // as the sequense of finding the are in the foem of febnoce so we find thenth
    // fibnocee of a number
    public static int fibnoc(int n) {
        if (n <= 1)// as to climb steps 1 and 2 the ways are it self
        {
            return n;
        }

        return fibnoc(n - 1) + fibnoc(n - 2);// recurive formula for finding the nth fibnociee series
    }
}

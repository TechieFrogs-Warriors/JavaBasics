package AssignmentPrograms;

import java.util.*;

public class Program9 {
    public void factorialNonZero() {
        Scanner obj = new Scanner(System.in);// taking user input
        int n;
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);
        System.out.println("its a Number: " + n);

        int j;
        int factorial1 = 1;
        for (j = 1; j <= n; j++) {
            factorial1 *= j;
        }
        System.out.println("Factorial of " + n + " is: " + factorial1);
        int nonzero = 1;

        // code for non zero factorial
        nonzero = factorial1 % 10;
        if (nonzero == 0) {
            factorial1 = Math.abs(factorial1 % 100);
            factorial1 = Math.abs(factorial1 / 10);
            System.out.println("last non zero digit of factorial is :: " + factorial1);
        } else {
            System.out.println("Last non zero digit of factorial is :: " + nonzero);
        }

        obj.close();

    }

    public static void main(String[] args) {
        Program9 obj1 = new Program9();
        obj1.factorialNonZero();
    }

}

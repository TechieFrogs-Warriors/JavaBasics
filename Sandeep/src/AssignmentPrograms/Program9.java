package AssignmentPrograms;

import java.util.*;

public class Program9 {
    public void factorialNonZero() {
        Scanner obj = new Scanner(System.in);// taking user input
        int n;
        // validation for input
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
        // code for factorial
        for (j = 1; j <= n; j++) {
            factorial1 *= j;// it multiplies the every number less than the number
        }
        System.out.println("Factorial of " + n + " is: " + factorial1);
        int nonzero = 1;

        // code for non zero factorial
        nonzero = factorial1 % 10;// gets reminder i.e last digit in a number
        if (nonzero == 0) {// if last digit in anumber is zero then the if condition is excuted
            factorial1 = Math.abs(factorial1 % 100);
            factorial1 = Math.abs(factorial1 / 10);// gets a queficient other than last digit in a number
            System.out.println("last non zero digit of factorial is :: " + factorial1);
        } else {
            System.out.println("Last non zero digit of factorial is :: " + nonzero);
        }
        obj.close();

        

    }

    // main method
    public static void main(String[] args) {
        Program9 obj1 = new Program9();
        obj1.factorialNonZero();
        
       
    }

}

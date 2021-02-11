package Practice;

import java.util.*;

public class fullpyramidusingstar {
    public static void main(String[] args) {
        System.out.println("------ Pattern using alphabets -----");
        Scanner obj = new Scanner(System.in);

        // validation of input

        int row;
        System.out.println("------ Validation for  input ------");
        do {
            System.out.println("enter  number of rows : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                obj.next();
            }
            row = obj.nextInt();
        } while (row <= 0);

        // code to print pattern
        for (int i = 1; i <= row; i++) {
            for (int s = i; s < row; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}

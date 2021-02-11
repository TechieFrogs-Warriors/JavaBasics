package Practice;

import java.util.*;

public class Invertedhalfpyramidusingnumbers {
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

        for (int i = row; i >= 0; i--) {
            int num = 1;
            for (int j = i; j >= 0; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
        obj.close();
    }
}

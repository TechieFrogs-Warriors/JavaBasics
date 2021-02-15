package Practice;

import java.util.*;

public class Alphapattern {
    public static void main(String[] args) {
        System.out.println("---- pattern -----");
        Scanner obj = new Scanner(System.in);
        // validation
        int row;
        System.out.println("--- validation-----");
        do {
            System.out.println("Enter Number of rows : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a positive number please enter postive number : ");
                obj.next();
            }
            row = obj.nextInt();
        } while (row <= 0);
        System.out.println("the rows are : " + row);
        // codding for pattern
        for (int i = 0; i <= row; i++) {// outer loop for row
            // int alphabet = 65;
            for (int j = i; j <= row; j++) {//first half of row
                System.out.print((char) (65 + j) + " ");
            }
            for (int k = row - 1; k >= i; k--) {//second half of row
                System.out.print((char) (65 + k) + " ");
            }
            System.out.println();
        }

    }

}

package Practice;

import java.util.*;

public class Halfpyrimidalpha {
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

        // code for pattern
        char ch = 65;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

            }
            System.out.println();
            ch++;

        }
        obj.close();

    }

}

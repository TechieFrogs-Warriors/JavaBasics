import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {

        System.out.println("----- Pattern -----\n");
        Scanner obj = new Scanner(System.in);

        // validation for input
        int row;
        System.out.println("------ Validation for  input ------\n");
        do {
            System.out.println("enter  number of rows : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                obj.next();
            }
            row = obj.nextInt();
        } while (row <= 0);
        System.out.println("The rows to be printed are : " + row);

        char ch = 'a';
        int i, j;
        for (i = row; i >= 1; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.print(" ");
            for (int k = i; k >= 0; k--) {
                if (k != row) {
                    System.out.print((char) (ch + k));
                } else {
                    System.out.print("");
                }
            }
            System.out.println();

        }
        for (i = 0; i <= row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.print(" ");
            for (int k = i; k >= 0; k--) {
                if (k == row) {
                    System.out.print("");

                }

                if (k != row) {
                    System.out.print((char) (ch + k));
                }

            }
            System.out.println();
        }

    }

}

import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {    

        System.out.println("----- Pyramid using star -----\n");
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

        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }

            for (j = row; j >= 1; j--) {
                if (i == j || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();

        }
        obj.close();

    }
}

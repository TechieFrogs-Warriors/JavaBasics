import java.util.*;

public class RightPascalTriangle {
    public static void main(String[] args) {

        System.out.println("----- Right pascal Triangle -----\n");
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

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= (row - 1); i++) {
            for (int j = (row - 1); j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}

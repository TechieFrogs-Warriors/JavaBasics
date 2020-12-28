import java.util.*;

public class LeftPascalTriangle {
    public static void main(String[] args) {

        System.out.println("----- Lest Pascal's Trinagle ------\n");
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
            for (int j = 1; j <= row - i; j++)// spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= x; y++)// spaces
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= row - x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();

    }
}

import java.util.*;

public class DiamondShapePattern {
    public static void main(String[] args) {

        System.out.println("----- Diamond Shape Pattern --------");

        // validation upper pyrimd
        Scanner obj = new Scanner(System.in);
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
        System.out.println("The rows to be printed are : " + row);

        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++)// spaces
            {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // inverse pyramid

        for (int x = (row - 1); x >= 1; x--) {
            for (int y = (row - 1); y > x; y--) // spaces
            {
                System.out.print("  ");
            }
            for (int z = 1; z < (x * 2); z++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        obj.close();
    }
}

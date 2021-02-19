import java.util.*;

public class SandglassStarPattern {
    public static void main(String[] args) {
        System.out.println("------- Sand glass Star pattern --------\n");
        Scanner obj = new Scanner(System.in);

        // validation for input
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

        for (int x = row; x >= 1; x--) {
            for (int y = row - x; y >= 1; y--) // spaces
            {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++)// spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();

    }
}

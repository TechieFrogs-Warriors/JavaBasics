import java.util.*;

public class Inversefullpyramidusingstar {
    public static void main(String[] args) {

        System.out.println("----- Inverse full pyramid using star -----");
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

        for (int i = row; i >= 1; i--) {
            for (int j = row; j > i; j--) // spaces
            {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}

import java.util.*;

public class fullpyramidusingstar {
    public static void main(String[] args) {

        System.out.println("---- Full pyramid using * ----");
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

        // pyrmid code

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
        obj.close();
    }
}

import java.util.*;

public class Pascaltrianglenumbers {
    public static void main(String[] args) {
        System.out.println("----- Pascal triangle using numbers -----\n");
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

        for (int i = 0; i < row; i++) {

            for (int j = 1; j < row - i; j++) {// spaces
                System.out.print(" ");
            }

            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");

                // number = number * (i - k) / (k + 1);// formula
            }
            System.out.println();

        }
    }
}

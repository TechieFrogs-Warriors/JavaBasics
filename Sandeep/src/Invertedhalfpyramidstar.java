import java.util.*;

public class Invertedhalfpyramidstar {
    public static void main(String[] args) {

        System.out.println("----- Inverted half pyramid using star -----\n");
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
            for (int j = row; j >= i; j--) {
                System.out.print(" *");

            }
            System.out.println();
        }
        obj.close();
    }
}

import java.util.*;

public class Pattern1 {
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

        for (int i = 1; i <= row; i++) {// this loop is used to print lines
            for (int j = row; j >= 1; j--) {// this loop is used to print numbers in a line
                if (j != i)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        // return 0;
        obj.close();
    }
}

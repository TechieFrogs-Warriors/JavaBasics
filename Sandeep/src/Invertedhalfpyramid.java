import java.util.*;

public class Invertedhalfpyramid {
    public static void main(String[] args) {

        System.out.println("----- Inverted Half pyramid using numbers -----\n");
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
            int a = 1;
            for (int j = row; j >= i; j--) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
        obj.close();
    }

}

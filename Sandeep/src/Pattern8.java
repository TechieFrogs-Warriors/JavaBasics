import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {

        System.out.println("----- Pattern -----\n");
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

        System.out.println("0");
        for (int i = row; i >= 1; i--) {
            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }
            System.out.print("0");
            for (int j = row; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        obj.close();
    }
}

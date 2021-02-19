import java.util.*;

public class Pattern7 {
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

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = row; j >= 1; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        obj.close();
    }
}

import java.util.*;

public class Alphabetpattern16 {
    public static void main(String[] args) {

        System.out.println("------ Pattern using alphabets -----");
        Scanner obj = new Scanner(System.in);

        // validation of input

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

        for (int i = 0; i <= row - 1; i++) {
            int c = 65;
            for (int j = row - 1; j > i; j--) {// spaces
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (c + k) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= row; i++) {
            int c = 65;
            for (int j = 0; j <= i; j++) {// spaces
                System.out.print(" ");
            }
            for (int k = 0; k <= row - i; k++) {
                System.out.print((char) (c + k) + " ");
            }
            System.out.println();
        }

        obj.close();

    }
}

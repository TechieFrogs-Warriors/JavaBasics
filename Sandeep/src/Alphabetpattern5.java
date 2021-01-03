import java.util.*;

public class Alphabetpattern5 {
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

        for (int i = row; i >= 0; i--) {
            int c = 65;
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (c + j) + " ");
            }
            System.out.println();
        }

        for (int x = 0; x <= row; x++) {
            int ch = 65;
            for (int y = x; y >= 0; y--) {
                System.out.print((char) (ch + y) + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}

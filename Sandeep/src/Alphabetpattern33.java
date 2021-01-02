import java.util.*;

public class Alphabetpattern33 {
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

        int c = 65;
        int k = 1;
        for (int i = 1; i <= row; i++) {
            k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (c + k - 1) + " ");
                k = k + row - j;
            }
            System.out.println();
        }

        obj.close();
    }
}

import java.util.*;

public class Alphabetpattern35 {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print((char) (c + j * row - (j - 1) * j / 2 + i - j) + " ");
                } else {
                    System.out.print((char) (c + j * row - (j - 1) * j / 2 + row - 1 - i) + " ");
                }
            }
            System.out.println();
        }

        obj.close();
    }
}

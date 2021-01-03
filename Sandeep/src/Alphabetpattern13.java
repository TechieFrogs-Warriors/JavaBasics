import java.util.Scanner;

public class Alphabetpattern13 {
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

        for (int i = 0; i <= row; i++) {
            for (int j = row; j > i; j--) {// spaces
                System.out.print(" ");
            }
            int temp = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (c - 1 + temp) + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }

        obj.close();
    }
}

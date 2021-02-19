import java.util.*;

public class halfpyramidusingalphabets {
    public static void main(String[] args) {
        System.out.println("------ hald=f pyrmid using alphabets -----");
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
        System.out.println("The rows to be printed are : " + row);

        int letter = 65;// ASCII value of a
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");// converstion from ASCII value to the Letter
            }
            System.out.println();
        }
        obj.close();
    }
}

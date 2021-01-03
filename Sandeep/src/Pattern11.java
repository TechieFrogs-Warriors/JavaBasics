import java.util.*;

public class Pattern11 {
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
        System.out.println("The rows to be printed are : " + row);

        for (int i = 1; i < row; i++) // increase count 10 to 27 to print till "z"
        {
            String str = "";
            int alphabet = 97; // ASCII value of A = 65 and a=97
            for (int j = 1; j <= i; j++) {
                str = str + (char) alphabet + " + ";
                alphabet++;
            }
            System.out.println("(" + str.substring(0, str.length() - 3) + ")");
        }

        obj.close();
    }
}

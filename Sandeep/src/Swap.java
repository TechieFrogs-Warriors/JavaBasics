import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i;

        System.out.println("------ Validation for  number i ------");
        do {
            System.out.println("enter  Postive Number i : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            i = obj.nextInt();
        } while (i <= 0);
        System.out.println("its a Number i : " + i);

        int j;

        System.out.println("------ Validation for  number j ------");
        do {
            System.out.println("enter  Postive Number j : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            j = obj.nextInt();
        } while (j <= 0);
        System.out.println("its a Number j : " + j);

        int k;
        System.out.println("Values before swapping i: " + i + " j: " + j);
        // swapping
        k = i;
        i = j;
        j = k;

        System.out.println("Values After swapping i: " + i + " j: " + j);

        obj.close();
    }

}

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        System.out.println("---- GCD of two numbers using for loop -------");
        Scanner obj = new Scanner(System.in);
        int n1, n2, gcd = 1;

        System.out.println("------ Validation for  number n1 ------");
        do {
            System.out.println("enter  Postive Number n1 : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n1 : ");
                obj.next();
            }
            n1 = obj.nextInt();
        } while (n1 <= 0);
        System.out.println("its a Number n1 : " + n1);

        System.out.println("------ Validation for  number n2 ------");
        do {
            System.out.println("enter  Postive Number n2 : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n2 : ");
                obj.next();
            }
            n2 = obj.nextInt();
        } while (n2 <= 0);
        System.out.println("its a Number n2 : " + n2);

        for (int i = 1; i <= n1 && i <= n2; i++) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        System.out.println("G.C.D of " + n1 + " and " + n2 + " is " + gcd);
        obj.close();
    }
}

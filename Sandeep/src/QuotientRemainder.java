import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int dividend;

        System.out.println("------ Validation for  number dividend ------");
        do {
            System.out.println("enter  Postive Number for dividend : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            dividend = obj.nextInt();
        } while (dividend <= 0);
        System.out.println("its a Number dividend : " + dividend);

        int divisor;

        System.out.println("------ Validation for  number divisor ------");
        do {
            System.out.println("enter  Postive Number for divisor : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            divisor = obj.nextInt();
        } while (divisor <= 0);
        System.out.println("its a Number divisor : " + divisor);

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
        obj.close();
    }
}

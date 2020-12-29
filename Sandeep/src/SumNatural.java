import java.util.*;

public class SumNatural {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("------ Sum of Natural numbers using For loop -------");
        int number;

        System.out.println("------ Validation for  number ------");
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            number = obj.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        int sum = 0;

        for (int i = 1; i <= number; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum is : " + sum);

        System.out.println("------ Sum of Natural numbers using While loop -------");
        int n;

        System.out.println("------ Validation for  number n  ------");
        do {
            System.out.println("enter  Postive Number n : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);
        System.out.println("its a Number n : " + n);

        int s = 0, i = 1;
        while (i <= n) {
            s += i;
            i++;
        }

        System.out.println("Sum is : " + s);

        obj.close();
    }
}

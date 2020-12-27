import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("------- Factorial Using While Loop --------");

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

        int i = 1;
        long factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        System.out.println("------- Factorial Using For Loop --------");
        int n;
        System.out.println("------ Validation for  number ------");
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);
        System.out.println("its a Number: " + n);

        int j;
        long factorial1 = 1;
        for (j = 1; j <= n; j++) {
            factorial1 *= j;
        }
        System.out.println("Factorial of " + n + " is: " + factorial1);

        obj.close();

    }
}

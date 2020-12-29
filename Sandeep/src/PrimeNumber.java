import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("------- Prime Number --------");
        Scanner obj = new Scanner(System.in);
        int number, count = 0, i = 1;

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

        // prime number
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        obj.close();
    }
}

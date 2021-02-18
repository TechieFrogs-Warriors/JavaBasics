package AssignmentPrograms;

import java.util.*;

public class Program13 {
    public void collatz(int number) {
        // till the loop reaches 1 this loop will excutes
        while (number != 1) {
            System.out.print(number + " ");

            // If Pk is even, Pk+1 = Pk/ 2
            if (number % 2 == 0) {
                number = number / 2;
            }
            // If Pk is odd, Pk+1 = (3 * Pk) +1
            else {
                number = (3 * number) + 1;
            }
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            number = obj.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        Program13 obj1 = new Program13();
        obj1.collatz(number);

        obj.close();
    }

}

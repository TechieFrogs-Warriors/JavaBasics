import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num;
        System.out.println("------ Validation for  number ------");
        do {
            System.out.println("enter   Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter  Number: ");
                obj.next();
            }
            num = obj.nextInt();
        } while (num == 0);
        System.out.println("its a Number: " + num);

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        obj.close();
    }
}

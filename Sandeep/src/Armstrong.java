import java.util.*;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("------ Armstrong Number ----------");
        Scanner obj = new Scanner(System.in);

        // validation
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

        // armstrong
        int sum = 0, r, temp = 0;
        temp = n;
        while (n != 0) {
            r = n % 10; // getting reminder
            sum = sum + (r * r * r);
            n = n / 10; // getting quotient
        }
        if (temp == sum) {
            System.out.println(temp + " is a Armstrong Number ");
        } else {
            System.out.println(temp + " is not a Armstrong Number");
        }
        obj.close();
    }

}

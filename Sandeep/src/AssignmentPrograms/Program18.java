package AssignmentPrograms;

import java.util.*;

public class Program18 {
    public void factorial() {
        Scanner obj = new Scanner(System.in);// taking user input
        int n;
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
        for (j = 1; j <= n; j++) {// loop it itertaes till the number
            factorial1 *= j;// multiplies each and every number and stores the result
        }
        System.out.println("Factorial of " + n + " is: " + factorial1);

        obj.close();

    }

    public static void main(String[] args) {

        Program18 obj1 = new Program18();
        obj1.factorial();
        
    }
}

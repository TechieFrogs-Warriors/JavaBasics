import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("------ Validation for  number ------");
        do {
            System.out.println("enter  Postive Number n value : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);
        System.out.println("its a n : " + n);

        int rem, rev = 0, temp;

        temp = n;
        while (n > 0) {
            rem = n % 10;// getting reminder
            rev = (rev * 10) + rem;
            n /= 10;// n=n/10; getting Quotient
        }
        // palindrome if original integer(temp) and reverse integer(rev) are equal
        if (temp == rev) {
            System.out.println(temp + "  is palindrome number");
        } else {
            System.out.println(temp + "  is not a plindrome number");
        }
        obj.close();
    }
}

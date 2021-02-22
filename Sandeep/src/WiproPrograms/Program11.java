package WiproPrograms;

import java.util.*;

public class Program11 {
    public static int number;

    // input validation
    // validation method
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number = inputValidation(sc);

        int rem, rev = 0, temp;

        temp = number;// storing the number to temp valiable

        while (number > 0) {
            rem = number % 10;// getting reminder
            rev = (rev * 10) + rem;
            number /= 10;// n=n/10; getting Quotient
        }

        System.out.println(rev);
        int Playersscore;
        Playersscore = temp - rev;// subrtacting the number and reverse of number
        System.out.println("Player score is :: " + Playersscore);

    }

}

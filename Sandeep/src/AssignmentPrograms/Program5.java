package AssignmentPrograms;

import java.util.*;

public class Program5 {
    public void perfectNumber() {
        Scanner sc = new Scanner(System.in);
        // input validation for range1
        int range1;
        do {
            System.out.println("enter  range1 : ");
            while (!sc.hasNextInt()) {// checks wether input is integer or not
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range1 = sc.nextInt();
        } while (range1 <= 0);// if given range is greater than 0 then loop terminates
        System.out.println("its a Number: " + range1);

        // input validation for range2
        int range2;
        do {
            System.out.println("enter range2 : ");
            while (!sc.hasNextInt()) {// checks wether input is integer or not
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range2 = sc.nextInt();
        } while (range2 <= 0);// if given range is greater than 0 then loop terminates
        System.out.println("its a Number: " + range2);

        int sum = 0;
        for (int i = range1; i <= range2; i++)// this loop interatess till the given range
        {
            sum = 0;
            for (int j = 1; j < i; j++) {// loop adds the values

                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {// if the sum and the ith value is same then it prints
                System.out.println(i + "   ");
            }
        }
        sc.close();

    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.perfectNumber();
    }

}

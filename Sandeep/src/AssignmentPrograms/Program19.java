package AssignmentPrograms;

import java.util.*;

public class Program19 {
    public void sumOdd(int range1, int range2) {
        int sumOdd = 0;// intilizing the summOdd to 0 to add the odd numbers
        for (int i = range1; i <= range2; i++) {
            if (i % 2 != 0) {// if odd numbet it goes to the if condtion and add the numbers
                sumOdd += i;// adds the odd numbers and result is stored in sumOdd
            }
        }
        System.out.println("Sum of Odd numbers from" + range1 + " to " + range2 + "is :: " + sumOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// user input
        int range1;
        // validation for input 1st number
        do {
            System.out.println("enter  range1 : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range1 = sc.nextInt();
        } while (range1 <= 0);
        System.out.println("its a Number: " + range1);

        // input for the second number
        int range2;
        // validation for the second number
        do {
            System.out.println("enter range2 : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range2 = sc.nextInt();
        } while (range2 <= 0);
        System.out.println("its a Number: " + range2);

        Program19 obj = new Program19();// creating object
        obj.sumOdd(range1, range2);// calling method using object

        sc.close();

    }

}

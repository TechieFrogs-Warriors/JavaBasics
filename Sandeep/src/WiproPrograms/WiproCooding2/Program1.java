package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program1 {
    // method for input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        return number;
    }

    // method to print the sqare patten using *
    public static void sqauePattern(int rows) {
        // logic to print the given pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                // condition to print rows 1st coum and rows last coum and 1st row and lst colum
                // *
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                }
                // other than above condtion all should print nothing i.e space shou;d be
                // printed
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many rows you want :: ");
        int rows = inputValidation(sc);// inputvalidation

        sqauePattern(rows);// call a method sqare pattern

    }

}

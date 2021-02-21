package WiproPrograms;

import java.util.*;

public class Program7 {
    public static int size;

    // input validation
    // validation method
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            size = sc.nextInt();
        } while (size <= 0);

        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr size :: ");
        size = inputValidation(sc);// input validation

        System.out.println("Enetr numbers :: ");
        // taketing inputs i.e is different numbers
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Original elements are :: ");
        for (int i = 0; i < size; i++) {// printing original elements
            System.out.print(number[i] + " ");
        }
        int a = 2, b = 5;

        System.out.println("\n\nReverse order of elemnts in array are ");
        for (int i = 0; i < size; i++) {// llop to print the numbers befor the start point
            System.out.print(number[i] + " ");
            if (i == (a - 1)) {// condition to start rev form the start point
                for (int j = b; j >= a; j--) {// reverse the values from start to end point
                    System.out.print(number[j] + " ");
                }
                break;// after excuting the values the loop btreaks after the end point no values will
                      // be excuted
            }

        }

    }

}

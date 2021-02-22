package WiproPrograms;

import java.util.*;

public class Program6 {
    public static int size;

    // metod to check cobe or not
    static boolean Cube(int number) {
        int root = (int) Math.cbrt(number);
        return (root * root * root) == number;
    }

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
        // ckecking the cubic numbers in the input taken
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Cube(number[i])) {
                count++;
            }
        }
        System.out.println("number of cubic numbers are :: " + count);

    }

}

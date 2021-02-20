package WiproPrograms;

import java.util.*;

public class Program5 {
    public static int size;

    public static void addDigit(int number) {
        int sum = 0;
        int reminder;
        while (number != 0) {// this loop iterates till the number is 0
            reminder = number % 10;// gets the remider value i.e last digit
            number = number / 10;// gets Queficent value exept the last digit in a number
            sum = sum + reminder;// every time remider gets added to sum
        }
        System.out.print("  " + sum);
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

        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            addDigit(num[i]);
        }

    }

}

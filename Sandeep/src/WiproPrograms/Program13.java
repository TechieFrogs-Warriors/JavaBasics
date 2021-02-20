package WiproPrograms;

import java.util.*;

public class Program13 {
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
        size = inputValidation(sc);// input validation for user input
        System.out.println("Enetr numbers :: ");

        int[] num = new int[size];
        for (int i = 0; i < size; i++) {// tacking input to elemts into array
            num[i] = sc.nextInt();
        }

        System.out.println("Elemts in array are");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        int range1 = 2, range2 = 4;
        System.out.println("\nElemts other then the range are");
        for (int i = 0; i < size; i++) {
            if (num[i] >= range1 && num[i] <= range2) {
                continue;
            } else {
                System.out.print(num[i] + " ");
            }
        }

    }

}

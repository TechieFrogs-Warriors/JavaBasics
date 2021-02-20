package WiproPrograms;

import java.util.*;

public class Program9 {
    public static int size;
    private static int[] arr1;
    private static int[] arr2;
    private static int arr;

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

    public static void prime(int number) {

        // return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = inputValidation(sc);

        System.out.println("Enetr numbers :: ");
        // taketing inputs i.e is different numbers
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // code for prime
        int count = 0, i = 1;
        for (int j = 0; j < size; j++) {
            while (i <= number[j]) {
                if (number[j] % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                arr1[j] = number[j];
            } else {
                // System.out.println(number + " is not a prime number");
                arr2[j] = number[j];
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));

        }
        // for (int j = 0; j < size; j++) {
        // arr = (arr1[j] + arr2[j]);
        // }

    }

}

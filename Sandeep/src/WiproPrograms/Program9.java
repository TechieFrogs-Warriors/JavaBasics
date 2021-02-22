package WiproPrograms;

import java.util.Scanner;

public class Program9 {
    public static int size;

    // input validation
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

    public static boolean prime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = inputValidation(sc);
        int[] number = new int[size];// input array
        // To store non prime numbers
        int[] nonPrimeNum = new int[number.length];
        boolean isPrime = false;// prime check variable
        int primeCount = 0;// prime count
        int j = 0;
        // Taking elements into Array
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        // Logic
        for (int i = 0; i < number.length; i++) {
            if (number[i] <= 1) {
                nonPrimeNum[j] = number[i];
                j++;
            } else {
                isPrime = prime(number[i]);
                if (isPrime) {
                    System.out.print(number[i] + " ");
                    primeCount++;
                } else {
                    nonPrimeNum[j] = number[i];
                    j++;

                }
            }

        }
        for (int i = 0; i < (size - primeCount); i++) {
            System.out.print(" " + nonPrimeNum[i]);
        }

    }

}

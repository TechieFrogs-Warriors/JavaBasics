package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program3 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr Size of an array you want :: ");
        int N = inputValidation(sc);// validating the input

        if (N >= 1 && N <= (Math.pow(10, 6))) {
            System.out.println("Enetr elemnts in array :: ");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)// intilizing the elemnts in the array
            {
                arr[i] = inputValidation(sc);// validaing the input
            }

            // sort the array using the sort method
            Arrays.sort(arr);

            // to find the 1st and 2nd largest number
            System.out.println("\n" + arr[N - 1] + " " + arr[N - 2]);
        } else {
            System.out.println("Invalid input");
        }

    }
}

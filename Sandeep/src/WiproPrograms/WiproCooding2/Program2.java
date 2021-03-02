package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program2 {
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

        System.out.println("Enter the length of array you :: ");
        int N = inputValidation(sc);// input validation

        System.out.println("Enter elemnts in the array :: ");
        int arr[] = new int[N];
        // intlizing the elemnts in the array
        for (int i = 0; i < N; i++) {
            arr[i] = inputValidation(sc);// validating the elemnts
        }
        // intilizing the D value to rotae the D times
        System.out.println("Enter D value to rotate the array :: ");
        int D = inputValidation(sc);

        if ((N >= 1 && N <= (Math.pow(10, 7)) && (D >= 1 && D <= N))) {
            // code of rarting the elents D time
            for (int i = 0; i < D; i++) {
                int first, j;
                // stores the 1st element
                first = arr[0];

                for (j = 0; j < N - 1; j++) {
                    // shift elents of arr by 1
                    arr[j] = arr[j + 1];
                }
                // 1st elemnt will be added to the end of arr
                arr[j] = first;
            }

            // printing the array after the rotation
            System.out.println("\n");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Invalid Input");
        }

    }

}

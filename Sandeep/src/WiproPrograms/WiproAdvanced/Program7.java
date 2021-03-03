package WiproPrograms.WiproAdvanced;

import java.util.*;

public class Program7 {
    /*
     * Use two loops: The outer loop picks all the elements one by one. The inner
     * loop looks for the first greater element for the element picked by the outer
     * loop. If a greater element is found then that element is printed as next,
     * otherwise -1 is printed.
     */
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

        // intilizing size of array
        System.out.println("Enter size of array :: ");
        int N = inputValidation(sc);// validating the input

        // intikizing the array
        System.out.println("Enter elemnts in the array ");
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputValidation(sc);// validating th einput
        }

        int next;
        for (int i = 0; i < N; i++)// loop picks all the elements one by one
        {
            next = -1;
            for (int j = i + 1; j < N; j++) {// oop looks for the first greater element for the element picked by the
                                             // outer loop

                if (arr[i] < arr[j])// ith elemnt is greater than jth elemnt
                {
                    next = arr[j];
                    break;// breask th einner loop
                }
            }
            System.out.print(next + " ");
        }
    }

}

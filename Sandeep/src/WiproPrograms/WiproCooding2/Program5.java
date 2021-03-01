package WiproPrograms.WiproCooding2;

import java.util.*;
/*
        1.traverse through the array from statrt top end using i and j values

        2.for every travrese if the current element is greaterthan th enext elemnt then incremnt the count

        3.incrent the cont for every time the stept 2 is excuted

        4.display th ecount value

        */

public class Program5 {
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

        // intilizing the size of array
        System.out.println("Enter size of array :: ");
        int N = inputValidation(sc);// validating the input

        // intilizing the array and elemnts in array
        System.out.println("Enter elemnts in the array ");
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = inputValidation(sc);// validating the input values
        }

        if (N >= 1 && N <= Math.pow(10, 5)) {
            // code to find the subsets of inverse of array

            int count = 0;// intilizing the count to count the number of inverse subsets

            for (int i = 0; i < N - 1; i++)// intially assiging i to th efist value and it iterates till the last but
                                           // one
                                           // value
            {
                for (int j = i + 1; j < N; j++)// ibtially j is assiged to the next value of i and iterates till the
                                               // last
                                               // value
                {
                    if (arr[i] > arr[j])// if ith value is grtaer than jth value than its a inverse subset so the count
                                        // increments
                    {
                        count++;
                    }

                }

            }
            System.out.println("\n " + count);

        } else {
            System.out.println("Invalid input");
        }

    }

}

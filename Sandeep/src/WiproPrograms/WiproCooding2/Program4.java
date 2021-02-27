package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program4 {
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

        // intilizing the 1st array
        System.out.println("Enter the size of 1st array :: ");
        int N = inputValidation(sc);

        // intilizing the array and elemnts
        System.out.println("Enter elemnts of 1st array ");
        int arr1[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = inputValidation(sc);
        }

        // intilizing the 2nd array
        System.out.println("Enter the size of 2nd array :: ");
        int M = inputValidation(sc);

        // intilizing the array and elemnts
        System.out.println("Enter elemnt sof 2nd array ");
        int arr2[] = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = inputValidation(sc);
        }

        if (N >= 1 && N <= (Math.pow(10, 5)) && (M >= 1 && M <= Math.pow(10, 5))) {
            // code for the union of 2 arrays
            int i = 0, j = 0;
            while (i < N && j < M)// loop iterates till the M & i and N & j values are equal-1
            {
                if (arr1[i] < arr2[j])// if th earr1 ith value is less than the arr2 jth value then i value is printed
                {
                    System.out.print(arr1[i] + " ");
                    i++;// after printh th evalue every time i is incremented to go to the next index
                        // value
                } else if (arr2[j] < arr1[i])// if the arr2 jth value is less than the arr1 ith value then j value is
                                             // printed
                {
                    System.out.print(arr2[j] + " ");
                    j++;// every time after th eprinting the jth value j is incremented to go to next
                        // index value
                } else// when the both the index values i.e i nad j are equal then print any one of
                      // the value
                {
                    System.out.print(arr2[j] + " ");
                    j++;
                    i++;// incrent the value to go to the next index value
                }
            }

            // now as th eboth are not equal print the remaining values of the array i.e
            // left values in the arr1 and arr2
            while (i < N) {
                System.out.print(arr1[i] + " ");// printing the values
                i++;// after printing the values the i values is incremnted to go to the next index
                    // value
            }
            while (j < M) {
                System.out.print(arr2[j] + " ");
                j++;// after printing the values the j values is incremnted to go to the next index
                    // value
            }

        } else {
            System.out.println("Invalid input");
        }

    }

}

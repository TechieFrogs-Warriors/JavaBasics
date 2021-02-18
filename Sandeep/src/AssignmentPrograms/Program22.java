package AssignmentPrograms;

import java.util.*;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;// how many types of sizes nedded

        // input validation
        do {
            System.out.println("enter  size : ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("its a Number: " + n);

        int arr1[] = new int[n];// intilizing the arrys
        int arr2[] = new int[n];

        // intilizing the feet values usinng array
        System.out.println("enter feet values --");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // intilizing inch values using array
        System.out.println("Enter int values");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // intilizing another array to store the result values
        int arr[] = new int[n];

        // loop for converting the feet to inches and add
        for (int i = 0; i < n; i++) {
            arr[i] = (arr1[i] * 12) + arr2[i];
        }
        // sort the result array
        Arrays.sort(arr);

        // getting the max inches value from the result
        System.out.println("Max value is :: " + arr[n - 1]);

    }

}

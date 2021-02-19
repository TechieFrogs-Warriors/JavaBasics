package AssignmentPrograms;

import java.util.*;

public class Program4 {
    // absolute difference logic
    public int absoluteDifference(int arr[], int len) {
        Arrays.sort(arr);// sorting of array

        int sum = 0;// intilizing the sum to 0 to caluclatethe difference

        // absolute difference of the 1st array values in for loop 1st elemnt is
        // calculated
        sum += Math.abs(arr[0] - arr[1]);

        // abosolute difference od last values in loop last element is not calculated
        sum += Math.abs(arr[len - 1] - arr[len - 2]);

        // finding the absolute difference for the rest of the values in the array
        // excpet last and first
        for (int i = 1; i < len - 1; i++) {
            // calucate the min value of the difference
            sum += Math.min(Math.abs(arr[i] - arr[i - 1]), Math.abs(arr[i] - arr[i + 1]));

        }

        return sum;

    }

    public static void main(String[] args) {
        Program4 obj = new Program4();// creting a object

        Scanner sc = new Scanner(System.in);
        int len;
        // validation for input length
        do {
            System.out.println("enter  Length of Array : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            len = sc.nextInt();
        } while (len <= 0);
        System.out.println("its a Number: " + len);

        int arr[] = new int[len];
        System.out.println("Enter Elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling method absolute difference
        System.out.println("Difference is :: " + obj.absoluteDifference(arr, len));
        sc.close();
    }

}

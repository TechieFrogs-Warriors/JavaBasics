package InterViewCoddingQuestions;

import java.util.*;

public class FindSubArraysWithGivenSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter target value :: ");
        int target = sc.nextInt();

        System.out.println("Enter elements :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solve(arr, target);

    }

    public static void solve(int[] arr, int target) {
        for (int start = 0; start < arr.length; start++) {
            // initialize the sum of the current subarray to 0.
            int currSum = 0;
            for (int end = start; end < arr.length; end++) {
                // add every element of the current subarray
                // to the current running sum.
                currSum += arr[end];

                // print the starting and ending indices once we get
                // subarray with given sum
                if (currSum == target) {
                    System.out.println("starting index : " + start + ", " + "Ending index : " + end);

                }

            }
        }
    }
}

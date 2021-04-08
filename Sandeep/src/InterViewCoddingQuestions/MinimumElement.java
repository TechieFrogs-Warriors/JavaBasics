package InterViewCoddingQuestions;

import java.util.*;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :: ");
        int length = sc.nextInt();

        System.out.println("Enter elements in the array :: ");
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("The minimum element in the array is :: " + small);
    }
}

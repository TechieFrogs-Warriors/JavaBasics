package InterViewCoddingQuestions;

import java.util.*;

public class SmallestAndLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter length of the array :: ");
        int length = sc.nextInt();

        System.out.println("Eneter elements :: ");
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int small = arr[0];
        int large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            } else if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest number is :: " + small + "\nLargest number is :: " + large);
    }
}

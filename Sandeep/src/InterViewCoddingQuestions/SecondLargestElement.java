package InterViewCoddingQuestions;

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array :: ");
        int size = sc.nextInt();

        System.out.println("enter Elements in the array :: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);// sorting the array using the built in method

        System.out.println("The second Largest element in the array :: " + arr[size - 2]);
    }
}

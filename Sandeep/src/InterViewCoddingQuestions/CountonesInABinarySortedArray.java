package InterViewCoddingQuestions;

import java.util.*;

public class CountonesInABinarySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :: ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter elemnts in the array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println("The Number Of 1's in the Array is :: " + count);
    }
}

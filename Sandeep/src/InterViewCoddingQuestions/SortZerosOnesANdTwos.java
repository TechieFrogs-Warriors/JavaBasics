package InterViewCoddingQuestions;

import java.util.*;

public class SortZerosOnesANdTwos {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 0, 0, 1, 2, 1 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

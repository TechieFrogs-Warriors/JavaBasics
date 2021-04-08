package InterViewCoddingQuestions;

import java.util.*;

public class SeparateZerosAndOnce {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 1, 0, 1, 1, 1, 0 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package Arraysprograms.Excercises;

import java.util.Arrays;

public class Excercises23 {
    public static void main(String[] args) {
        int arr[] = new int[] { 22, 33, 44, 55, 66, 77, 88, 99, 11, 222, 5858, 5, 6, 8 };

        Arrays.sort(arr);

        System.out.println("Sorted elemts are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

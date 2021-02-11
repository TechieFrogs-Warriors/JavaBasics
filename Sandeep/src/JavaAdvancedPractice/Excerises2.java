package JavaAdvancedPractice;

import java.util.*;

public class Excerises2 {
    public static void main(String[] args) {
        int arr[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
        System.out.println("Array before sorting---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray After sorting---");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}

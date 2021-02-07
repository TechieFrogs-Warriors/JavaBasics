package JavaAdvancedPractice;

import java.util.Arrays;

public class Excerises3 {
    public static void main(String[] args) {
        String arr[] = { "Sandeep", "Karthik", "Chandra", "Answini", "kalyani" };
        System.out.println("Array before sorting---");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nArray After Sorting---");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}

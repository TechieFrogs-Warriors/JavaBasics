package AssignmentPrograms;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr = new int[sc.nextInt()];
        // Taking input elemts from user from loop
        System.out.println("Enter elements into array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // To print elemts in array
        System.out.println("The array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic for sorting the array
        int[] freqarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freqarr[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freqarr[i]++;
                    arr[j] = '0'; // avoid duplication
                }
            }
        }
        System.out.println("Elements and their frequencies");
        for (int i = 0; i < freqarr.length; i++) {
            if (arr[i] != ' ' && arr[i] != '0')
                System.out.print(arr[i] + "-" + freqarr[i] + " ");
        }
        // sorting frequency of array
        Arrays.sort(freqarr);
        System.out.println(Arrays.toString(freqarr));
        sc.close();

    }

}

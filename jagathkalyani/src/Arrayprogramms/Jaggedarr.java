package Arrayprogramms;

import java.util.Arrays;

public class Jaggedarr {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
 
        // Initialize the elements
        arr[0] = new int[] { 1, 2, 3 };
        arr[1] = new int[] { 4, 5, 6, 7 };
        arr[2] = new int[] { 8, 9 };
 
        // print the array elements
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }  
}




class j1{
    public static void main(String[] args) {
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[3];
 
        // Second row has 2 columns
        arr[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("2D Jagged Array values");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    
}
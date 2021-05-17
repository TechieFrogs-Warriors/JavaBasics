package Java_Interview_programs;

import java.util.Scanner;

// Count 1’s in sorted Binary Array.
public class CountOnesInArray 
{
    public static void main(String[] args) 
    {
 
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
 
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = scn.nextInt();
        }
 
        System.out.println("Number of 1 in array :"+countBinaryOnes(0, arr.length-1, arr));
        scn.close();
 
    }
 
    public static int countBinaryOnes(int start, int end, int[] arr) 
    {
        if (arr[start] == 1) 
        {
        // start elem is one, hence all other elements will be one in 
                // virtual subarr.
            return end - start + 1;
        }
 
        if (arr[end] == 0) 
        {
             // end elem is zero this means, all previous elements of 
                 //subarr will be zeroes.
            return 0;
        }
 
        int mid = (start + end) / 2;
        int leftResult = countBinaryOnes(start, mid, arr);
        int rightResult = countBinaryOnes(mid + 1, end, arr);
        // divide the array into two virtual subHalves
        return leftResult + rightResult;
 
    }
}

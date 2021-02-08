package Advanced_Programs;

import java.util.Arrays;

public class Program9 
{
    public static void main(String[] args) 
    {
        //Two sorted arrays are taken
        int[] A = { 1, 4, 7, 8, 10 };
        int[] B = { 2, 3, 9 };
 
        for (int i=0;i<A.length;i++)
        {
            // compare the current element of `A[]` with the first element of `B[]`
            if (A[i] > B[0])
            {
                // swapping
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
 
                int first = B[0];
 
                // move `B[0]` to its correct position to maintain the sorted order of B[]
                int k;
                for (k = 1; k < B.length && B[k] < first; k++) 
                {
                    B[k - 1] = B[k];
                }
 
                B[k - 1] = first;
            }
        }
        //printing the merged sorted arrays as per their size
        System.out.println("X: " + Arrays.toString(A));
        System.out.println("Y: " + Arrays.toString(B));
        
    }
    
}

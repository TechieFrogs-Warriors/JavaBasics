package Java_Interview_programs;

import java.util.HashMap;

// Find all pairs of elements from an array whose sum is equal to given number
public class PairSumEqualTo_X_InArray 
{
    public static void findPairsEqualsToXUsingHashing(int arr[], int X) 
    {
        HashMap<Integer, Integer> element = new HashMap<Integer, Integer>();
        System.out.println("The pair whose sum is equal to "+X+ ": ");
        for (int i = 0; i < arr.length; i++) 
        {
            element.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) 
        {
            // we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
            // element twice
            if (element.get(X - arr[i]) != null && element.get(X - arr[i]) != i) 
            {
                System.out.println(arr[i] + "," + (X - arr[i]));
            }
        }
    }

    //Another logic
    public static void findPairsWithSumEqualsTo_X(int arr[], int X) 
    {
        if (arr.length < 2)
            return;
    
        System.out.println("The pair whose sum is equal to 15 using brute force method: ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                int tempSum = arr[i] + arr[j];
    
                if (tempSum == X) 
                {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        //Initializing array
        int[] arr = {5,2,8,4,5};
        int x = 10;//as per question take any value for 'x'
        //passing array to logic method
        PairSumEqualTo_X_InArray.findPairsEqualsToXUsingHashing(arr,x);

        //Another Logic
        PairSumEqualTo_X_InArray.findPairsWithSumEqualsTo_X(arr, x);

    }
}

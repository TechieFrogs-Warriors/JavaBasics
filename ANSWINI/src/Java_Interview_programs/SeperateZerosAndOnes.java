package Java_Interview_programs;

import java.util.Arrays;

//Given an array of 0’s and 1’s in random order, you need to separate 0’s and 1’s in an array.
public class SeperateZerosAndOnes 
{
    public static int[] separate0s1sSolution(int arr[])
    {
        int count=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for (int i = 0; i < count; i++) 
        {
            arr[i]=0;
        }
        for (int i = count; i < arr.length; i++) 
        {
            arr[i]=1;
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        //Initializing array
        int[] arr = {1,0,1,0,1};
        int[] result = SeperateZerosAndOnes.separate0s1sSolution(arr);
        System.out.println("Resultant array after rearranging 0's and 1's :"+Arrays.toString(result));
        
    }

}

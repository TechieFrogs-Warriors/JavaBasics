package Array_Concept;

import java.util.Arrays;

public class Program37 
{
    //program to concatanate two arrays
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int aLen = a.length;
        int bLen = b.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);

        System.out.println("After concatanation: "+Arrays.toString(result));
        
    }
    
}

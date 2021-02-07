package Advanced_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 
{
    //program to print 1st small,1st large,2nd small 2nd large.....from an arrayof elements
    public static void main(String[] args) 
    {
        //Taken an array of elements as input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Logic
        //sorted the given input array
        Arrays.sort(arr);
        System.out.println("sorted array elements are: "+Arrays.toString(arr));
        //taken a temporary array
        int[] temp = new int[arr.length];
        int Index = 0;
        for (int i=0,j=arr.length-1;i<=arr.length/2 || j>arr.length;i++,j--)
        {
            
            if(Index < arr.length)
            {
                temp[Index] = arr[i];
                Index++;
            }
            if(Index < arr.length)
            {
                temp[Index] = arr[j];
                Index++;
            }
            
        }
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = temp[i];
        }
        
        //printing the result
        System.out.println("1st small 1st large 2nd small 2nd large.... :  ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            
        sc.close();
    }
    
}

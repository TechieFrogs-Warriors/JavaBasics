package Array_Concept;

import java.util.Scanner;

public class Program9_10 
{
    public static void main(String[] args) 
    {
        //program to find largest and smallest element of an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements into array");
        //Taking input values one by one from user
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //To print all the taken input values
        System.out.println("The array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();//to print seperate line

        //Logic
        int large,small;
        large=small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(large < arr[i])
            {
                large = arr[i];
            }
            else if(small > arr[i])
            {
                small = arr[i];
            }
        }
        System.out.println("Largest element in the array is: "+large);
        System.out.println("Smallest element in the array is: "+small);
        sc.close();

    }
    
}

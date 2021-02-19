package Array_Concept;

import java.util.Arrays;
import java.util.Scanner;

public class Program16_17_19 
{
    public static void main(String[] args) 
    {
        //program to find largest and smallest element of an array
        //program to find 2nd large,3rd large,2nd small element from an array
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
        Arrays.sort(arr);//sort method arranges elements of array in ascending order
        Arrays.toString(arr);
        //Largest element in the array
        System.out.println("Largest element in the array is : "+arr[arr.length-1]);
        //Second Largest element in the array
        System.out.println("2nd Largest element in the array is : "+arr[arr.length-2]);
        //Third Largest element in the array
        System.out.println("3rd Largest element in the array is : "+arr[arr.length-3]);
        //Smallest element in the array
        System.out.println("Smallest element in the array is : "+arr[0]);
        //Second Smallest element in the array
        System.out.println("2nd smallest element in the array is : "+arr[1]);

        sc.close();
        
    }
    
}

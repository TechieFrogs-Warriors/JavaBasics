package Array_Concept;

import java.util.Scanner;

public class Program6 
{
    public static void main(String[] args) 
    {
        //program to reverse elements of an array
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
        System.out.println("The original array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();//for printing in seperate line

        //Logic
        //For Reverse printing
        System.out.println("The Reversed array elements are");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
    
}

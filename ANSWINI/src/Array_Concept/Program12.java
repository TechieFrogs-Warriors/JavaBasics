package Array_Concept;

import java.util.Scanner;

public class Program12 
{
    public static void main(String[] args) 
    {
        //program to find sum of array elements
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

        System.out.println();//to print in new line
        //Logic
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of array elements is: "+sum);
        sc.close();
    }
    
}

package Array_Concept;

import java.util.Scanner;

public class Program20 
{
    //program to find even and odd numbers from an array
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements into array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //logic
        System.out.println();//to print in the next line
        System.out.println("Even numbers from the array are: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");

            }
        }

        System.out.println();

        System.out.println("Odd numbers from the array are: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");

            }
        }
        sc.close();
        
    }
    
}

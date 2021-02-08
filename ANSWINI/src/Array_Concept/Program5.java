package Array_Concept;

import java.util.Scanner;

public class Program5 
{
    public static void main(String[] args) 
    {
        //program to print array elements
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr=new int[sc.nextInt()];
        //Taking input values one by one from user
        System.out.println("Enter elements into array");
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
        sc.close();
        
    }
    
}

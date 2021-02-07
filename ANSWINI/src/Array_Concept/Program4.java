package Array_Concept;

import java.util.Scanner;

public class Program4 
{
    //program to find duplicate elements of an array
    public static void main(String[] args) 
    {
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

        System.out.println();//To print in the next line
        
        //Logic
        System.out.println("Duplicate elements in the array is");
        for (int i=0;i<arr.length;i++) 
        {
            for (int j=i+1;j<arr.length;j++) 
            {
                if (arr[i]== arr[j]) 
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
    
}

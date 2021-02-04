package Array_Concept;

import java.util.Arrays;
import java.util.Scanner;

public class Program21 
{
    //program to find and remove duplicate elements of an array
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
        arr=Arrays.stream(arr).distinct().toArray();
        System.out.println("After duplicate elements removal,Array elements are: "+Arrays.toString(arr));
        
        sc.close();
    }
}

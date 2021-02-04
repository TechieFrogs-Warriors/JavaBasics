package Array_Concept;

import java.util.Scanner;

public class Program11 
{
    public static void main(String[] args) 
    {
       //program to find number of elements in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements into array");
        //Taking input values one by one from user
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Logic
        System.out.println("Number of elements in the array : "+arr.length);
        sc.close();
    }
    
}

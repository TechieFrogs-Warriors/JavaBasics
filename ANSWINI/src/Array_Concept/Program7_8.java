package Array_Concept;

import java.util.Scanner;

public class Program7_8 
{
    //program to print odd and even position elements from array
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

        System.out.println();//to print in the next line

        //printing EVEN positioned elements in the array
        System.out.println("Even positioned elements in the array are:");
        for(int i=1;i<arr.length;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();//to print in the next line

        //printing ODD positioned elements in the array
        System.out.println("Odd positioned elements in the array are: ");
        for(int i=0;i<arr.length;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
    
}

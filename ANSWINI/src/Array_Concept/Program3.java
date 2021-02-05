package Array_Concept;

import java.util.Scanner;

public class Program3 
{
    /*Function to left rotate arr[] of array length by d*/
    public static void leftRotate(int arr[], int d, int n) 
    { 
        for (int i=0;i<d;i++) 
        {
            leftRotatebyOne(arr, n); // Function is called for no_of_rotation times
        }
        
    } 
 
    public static void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp=arr[0]; 
        for (i=0;i<n - 1;i++) 
        {
            arr[i] = arr[i + 1]; // Left shift by one
        }
        arr[i] = temp;
         
    } 
 
    public static void main(String[] args) 
    {
        //program to Left rotate elements of an array
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

        // Left Rotating Array Logic
        int rotate=1;
        leftRotate(arr, rotate, arr.length);
        System.out.println("Array Elements after Left Rotating : "); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " "); // Printing elements after rotation
        }
        sc.close();
        
    }
    
}

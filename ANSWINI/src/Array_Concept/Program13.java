package Array_Concept;

import java.util.Scanner;

public class Program13 
{
    /*Function to right rotate arr[] of array length by d*/
    public static void rightRotate(int arr[], int d, int n) 
    { 
        for (int i=0;i<d;i++) 
        rightRotatebyOne(arr, n);      // Function is called for no_of_rotation times
    } 
 
    public static void rightRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[n - 1]; 
        for (i=n-1;i>0;i--) 
        {
            arr[i] = arr[i - 1];     // Right shift by one 
        }
        arr[0] = temp;
        
    } 

    public static void main(String[] args) 
    {
        //program to Right rotate elements of an array
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

        //Right Rotating Array Logic
        int rotate=1;
        rightRotate(arr, rotate, arr.length); 
        System.out.println("Array Elements after Right Rotating : "); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " "); // Printing elements after rotation
        }
        sc.close(); 
        
    }
    
}

package Array_Concept;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class Program14_15 
{
    public static void main(String[] args) 
    {
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

        System.out.println();//to print seperate line

        //Logic
        Arrays.sort(arr);//sort method arranges elements of array in ascending order
        System.out.println("Ascending order of the array elements: "+Arrays.toString(arr));

        //printing elements in descending order
        System.out.println("Descending order of the array elements: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");

        }
        sc.close();
        
        //another way by using sorting for descending order of array elements
        /* Integer[] a={1,2,3,4,5};
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("descending order of array elements: "+Arrays.toString(a)); */
        
    }
    
}

package Wipro_AdvancedPrograms2;

import java.util.Arrays;
import java.util.Scanner;
//Rearrange the array such that modified array should consst one max,one min,one max,one min....
import TCS_Programs.Validation;

public class RearrangeArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Taking array length
        System.out.println("Enter length of an array: "); 
        int arr_Length = Validation.integerValidation(sc);
        //Taking input array
        int[] originalArray = new int[arr_Length];
        //assign values to an array
        System.out.println("Enter values to an Array: ");
        for(int i=0;i<arr_Length;i++)
        {
            originalArray[i] = Validation.integerValidation(sc);
        }
        //calling method that performs logic
        rearrange(originalArray,arr_Length);

        sc.close();
        
    }

    //method that performs logic
    public static void rearrange(int[] originalArray,int arr_Length) 
    {
        //sort the array
        Arrays.sort(originalArray);

        //logic to print array elements
        System.out.println("\nModified Array is: ");

        int i=0, j=originalArray.length-1, k=0; //required variables

        //Loop to place elements in the positions
        while(i<arr_Length)
        {
            if(i%2==0)
            {
                System.out.print(originalArray[j]+" "); //if even it prints last element of the array
                j--;
            }
            else
            {
                System.out.print(originalArray[k]+" "); //if odd it prints first element of the array
                k++;
            }
            i++;
        }
        
    }

    
}

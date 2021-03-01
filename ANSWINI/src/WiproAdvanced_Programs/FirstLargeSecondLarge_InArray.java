package WiproAdvanced_Programs;

import java.util.Arrays;
import java.util.Scanner;

import TCS_Programs.Validation;

public class FirstLargeSecondLarge_InArray 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int[] arr = new int[Validation.integerValidation(sc)] ; //Array

        //Taking elements into array
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Validation.integerValidation(sc);
        }

        //calling method that implements logic
        largestAndSecondLargest(arr);
        sc.close();
        
    }

    //method that implements logic to find first large and second large elements of an array
    public static void largestAndSecondLargest(int[] arr) 
    {
        Arrays.sort(arr); //sorting the given Array
        Arrays.toString(arr); //coverting array to string

        //printing the large and second large elements of the array
        System.out.print(arr[arr.length-1]+" "); 

        if(arr.length==1) //if second large is not there
        System.out.print("-1");  //print -1
        else
        System.out.print(arr[arr.length-2]); //otherwise print that value
        
    }
    
}

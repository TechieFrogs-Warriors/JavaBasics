package WiproAdvanced_Programs;

import java.util.Arrays;
import java.util.Scanner;

import TCS_Programs.Validation;

public class UnionOfTwoArrays 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        //Declaring Array with size
        System.out.println("Enter array size");
        int M = Validation.integerValidation(sc);//size of first Array
        int N = Validation.integerValidation(sc);//size of second Array
        int[] arr1 = new int[M] ; //first Array
        int[] arr2 = new int[N] ; //second Array

        //Taking elements into the two arrays in sorted way
        System.out.println("Enter array elements");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = Validation.integerValidation(sc);
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = Validation.integerValidation(sc);
        }
        
        //calling method that performs union of two Arrays
        findUnion(arr1,arr2);
        sc.close();

    }

    //Method that implements logic to make union of two arrays
    public static void findUnion(int[] arr1,int[] arr2) 
    {
        int i=0,j=0;
		System.out.print("\nUnion of Arrays is : ");

        //first take only distinct elements in the arrays
        arr1 = Arrays.stream(arr1).distinct().toArray();
        arr2 = Arrays.stream(arr2).distinct().toArray();

        //Loop to do union of two arrays
		while(i < arr1.length && j < arr2.length)
		{
            //if first array element is smaller than second array element ,print first array element
			if(arr1[i] < arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
                
			}
            //if second array element is smaller than first array element,print second array element
			else if(arr2[j] < arr1[i])
			{
				System.out.print(arr2[j]+" ");
				j++;
                
			}
            //if both elements from two arrays are same then printing first array element
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			} 
		} 

        //to print remaining elements from both arrays
        while(i<arr1.length)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}
        while(j<arr2.length)
		{
			System.out.print(arr2[j]+" ");
			j++;
		} 
        
    }
    
}

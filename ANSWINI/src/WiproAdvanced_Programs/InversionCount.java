package WiproAdvanced_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class InversionCount 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        int N = Validation.integerValidation(sc); //Array size

        System.out.println("Enter array size");
        int[] arr = new int[N] ; //Array

        //Taking elements into array
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Validation.integerValidation(sc);
        }

        //calling method to find inversion count
        int invertCount = inversionCount(arr,N);
        System.out.println("Inversion count is: "+invertCount);

        
        sc.close();
        
    }

    //method that implements logic to find inversion count
    public static int inversionCount(int arr[],int N) 
    {
        int count = 0;
        for(int i = 0;i < N-1;i++)
        {
            if(arr[i]>arr[i+1]) //if any element is greater than to its next element 
            {
                count++; //then count
            }

        }
        
        return count;
    }
    
}

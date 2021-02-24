package AccenturePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDifference 
{
    //Logic
    static int sumOfMinAbsDifferences( int arr[] ,int n) 
    { 
        Arrays.sort(arr); //sorting the array
        int sum = 0; 
          
        // min absolute difference for the 1st array element 
        sum = sum + Math.abs(arr[0] - arr[1]); 
          
        // min absolute difference for the last array element 
        sum = sum + Math.abs(arr[n-1] - arr[n-2]); 
          
        // min absolute difference for rest of the array elements and add them to sum 
        for (int i=1;i<n-1;i++) 
        {
            sum = sum + Math.min(Math.abs(arr[i] - arr[i-1]),Math.abs(arr[i] - arr[i+1]));
        }  
        return sum;  
    }      

    public static void main(String args[]) 
    { 
        //Taking array size and elements from user input
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter array size");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter Array elements : ");
        for(int i=0;i<arr.length;i++) 
        {
            arr[i] = sc.nextInt();
        }
        int n = arr.length; //calculating array length
        
        // calling Method to find the sum of minimum absolute difference 
        System.out.println( "Sum = "+ sumOfMinAbsDifferences(arr, n));
        sc.close(); 
    } 
    
}

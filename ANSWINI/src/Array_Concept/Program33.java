package Array_Concept;

import java.util.Scanner;

public class Program33 
{
     //program to find Standard deviation of array elements
    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements into Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        //caluculating mean for array elements
        double total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        double mean=total/arr.length;
        System.out.println("Mean of array elements is: "+mean);
            
        //calculating standard deviation
        double standard_Deviation=0;
        for (int i = 0; i < arr.length; i++) 
        {
            standard_Deviation += Math.pow(arr[i] - mean, 2);

        }
        System.out.println("Standard Deviation is: "+Math.sqrt(standard_Deviation / arr.length));
        sc.close();
    }   
    
}

package Array_Concept;

import java.util.Scanner;

public class Program32 
{
    public static void main(String[] args) 
    {
        //program to find average of array elements
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        double[] arr=new double[sc.nextInt()];
        System.out.println("Enter elements into Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextDouble();
        }
        double total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        double average=total/arr.length;
        System.out.println("Average of array elements is: "+average);
        sc.close();
        
    }
    
}

package Wiproprograms2;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMaxandSecondMax 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=InputValidation(scanner);
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int arr1[]=largestAndSecondLargest(arr);//method calling
        for(int i=arr.length-1;i>arr.length-3;i--)//for loop for printing largest and second largest into array
        {
            System.out.print(arr1[i]+" ");
        }


        
    }
    public static int[] largestAndSecondLargest(int arr[])
    {
        int arr1[]= new int[5];
        Arrays.sort(arr);//array will be sorted
        for(int i=arr.length-1;i>arr.length-3;i--)//for loop for finding largest and second largest
        {
            arr1[i]=arr1[i]+arr[i];//placig largest and secon largest into another array
        }
        return arr1;
        
        
    }
    public static int InputValidation(Scanner scanner)
    {
        int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scanner.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scanner.next();
            }
            n=scanner.nextInt();
        }while(n<=0);
        return n;
    }
    
}

package Wiproprograms2;

import java.util.Scanner;

public class InversionCountOfArray 
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
        int inversionCount=inversionCount(arr, N);//method calling
        System.out.println("Inversion Count of given array is "+inversionCount);

        
    }
    public static int inversionCount(int arr[],int N)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)//for loop for first element
        {
            
            for(int j=i+1;j<arr.length;j++)//for loop for next element
            {
                
                if(arr[i]>arr[j])//compares the first element and next element
                {
                    count++;
                }
            }
            
        }
        return count;
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

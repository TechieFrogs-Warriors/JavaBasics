package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int arr[]= new int[num];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int num1=InputValidation(scan);
        Arrays.sort(arr);//array will be sorted
        for(int i=arr.length-1;i>num1;i--)
        {
            sum=sum+arr[i];//adds the maximum elements 
        }
        System.out.println(sum);
    }
    public static int InputValidation(Scanner scan)
    {
        int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            n=scan.nextInt();
        }while(n<=0);
        return n;
    }
    
    
}

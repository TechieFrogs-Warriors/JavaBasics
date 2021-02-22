package WiproPrograms;

import java.util.Scanner;

public class Sumofdigits 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int arr[]=new int[num];
        System.out.println("Enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            while(arr[i]>0)//checks whether element is not zero
            {
                sum=sum+arr[i]%10;//adds last element in number
                 arr[i]=arr[i]/10;
                 
            }
            System.out.print(sum+" ");
            
        }
        
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

package WiproPrograms;

import java.util.Scanner;

public class ReverseElements 
{
    public static void main(String[] args) 
    {
        Scanner scan = new  Scanner(System.in);
        int num=InputValidation(scan);
        int arr[]= new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int num1=InputValidation(scan);
        int num2=InputValidation(scan);
        for(int i=0;i<arr.length;i++)
        {
            if(i==num1)
            {
                for( i=num2;i>=num1;i--)
                {
                    System.out.print(arr[i]+" ");
                   
                }
                break;
            }
            
            System.out.print(arr[i]+" ");

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

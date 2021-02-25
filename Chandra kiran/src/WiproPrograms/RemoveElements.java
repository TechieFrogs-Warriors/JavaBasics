package WiproPrograms;

import java.util.Scanner;

public class RemoveElements 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int arr[]= new int[num];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int num1=InputValidation(scan);
        int num2=InputValidation(scan);
        for(int i=0;i<arr.length;i++)
        {
            if(num1>arr[i]||arr[i]>num2)//checks the numbers less than the num1 or greater than num2
            {
                System.out.print(arr[i]+" ");

            }
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

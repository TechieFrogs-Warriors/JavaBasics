package WiproPrograms;

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int n=0,rev=0,diff=0;

        while(num>0)//reversing again to the original form
        {
            n=num%10;
            rev=(rev*10)+n;
            num=num/10;
        
        }
        diff=num-rev;
        System.out.println(diff);
      
        
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

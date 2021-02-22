package WiproPrograms;

import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int rev=0,n=0,m=0,rev1=0;
        while(num>0)
        {
            n=num%10;
            rev=(rev*10)+n;
            if(rev%2==0)//checks the even condition
            {
                rev=rev+1;//adds one to the number
            }
            else
            {
                rev=rev-1;//decreaments onr to the number
            }
            num=num/10;
        }
        while(rev>0)//reversing again to the original form
        {
            m=rev%10;
            rev1=(rev1*10)+m;
            rev=rev/10;
        
        }
        System.out.println(rev1);
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

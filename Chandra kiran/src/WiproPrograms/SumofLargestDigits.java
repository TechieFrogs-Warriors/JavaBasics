package WiproPrograms;

import java.util.Scanner;

public class SumofLargestDigits 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int num1=InputValidation(scan);
        int num2=InputValidation(scan);
        int Sum = Max(num)+Max(num1)+Max(num2);
        int Sum1=Max1(num)+Max1(num1)+Max1(num2);
        int diff=Sum-Sum1;
        System.out.println(diff);
    }
    public static int Max(int num)
    {
        int max=0,n=0;
        while(num>0)
        {
            n=num%10;
            if(n>max)
            {
                max=n;
            }
            num=num/10;
        }
        return max;

    }
    public static int Max1(int num)
    {
        int max1=0,max=0,n;
       
       while(num>0)
       {
           n=num%10;
           
           if(n>max)//last digit is greater than max
           {
               max1=max;//second large element equals max value
               max=n;//max value equals to last digit
           }
           else if(n>max1)//last digit is greater than second max value
           {
               max1=n;//second max value is last digit
           }
               num=num/10;
           
        }
       return max1;
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

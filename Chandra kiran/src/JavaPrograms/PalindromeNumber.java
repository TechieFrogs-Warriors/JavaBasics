package JavaPrograms;

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number=InputValidation(scanner);
        int reversenumber=reverseOfNumber(number);//method calling 
        int sum=number+reversenumber;
        int reversesum=reverseOfNumber(sum);//method calling again
        if(sum==reversesum)//checks the sum is equal to reverse of sum
        {
            System.out.println("It is a palindrome");//if equal prints the statement
        }
        else
        {
            int sum1=0;
            int reversesum1=reverseOfNumber(sum);//repeat the procedure
            sum1=reversesum1+sum;
            int sum2=reverseOfNumber(sum1);
            if(sum2==sum1)
            {
                System.out.println("it is palindrome");
            }


        }
    }
    public static int reverseOfNumber(int number)//method to reverse a number
    {
        int temp=number;
        int reverseNumber=0,remainder=0;
        while(temp>0)
        {
            remainder=temp%10;
            reverseNumber=(reverseNumber*10)+remainder;
            temp=temp/10;

        }
        return reverseNumber;
    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
    
}

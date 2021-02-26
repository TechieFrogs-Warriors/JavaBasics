package InfosysPrograms;

import java.util.Scanner;

public class DivisiblebyK 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number ");
        int y=InputValidation(scanner);
        System.out.println("Enter bob number");
        int k=InputValidation(scanner);
        System.out.println("Enter Alice number");
        String x=Validation(scanner);
        int permutations=divisible_k(y,k,x);//method calling
        System.out.println("No.of permutations "+permutations);
        scanner.close();
    }
    public static int divisible_k(int y,int k,String x)
    {
        int len=x.length();
        int aliceNumber=Integer.parseInt(x);
        int decimalnumber=decimalConversion(aliceNumber,len,y);//method calling
        if(decimalnumber%k==0)//checks if decimalnumber is exactly divisible by k
        {
            return decimalnumber/k;////if true return the permutations(quotient)
         
        }
        else
        {
            int remainder=0,rev=0;
            while(decimalnumber!=0)//if not number will be reversed
            {
                remainder=decimalnumber%10;
                rev=(rev*10)+remainder;
                decimalnumber=decimalnumber/10;
            }
           decimalnumber= decimalConversion(rev, len, y);//again calling decimalConversion method
           if(decimalnumber%k==0)//checks if decimal number is exactly divisble by k
           {
               return decimalnumber/k;//if true return the permutations(quotient)
           }
           else
           {
               return 0;//if not returns zero
           }

        }
    }
    public static int decimalConversion(int number,int len,int y)//method for converting  given number into decimal number
    {
        int temp=0;
        int result=0;
        for(int i=0;i<len;i++)
        {
            temp=number%10;
            result=temp*((int)Math.pow(y, i));//formula for generating decimal number
            number=number/10;
         }
         return result;
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
    
    public static String Validation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[0-9]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    
}

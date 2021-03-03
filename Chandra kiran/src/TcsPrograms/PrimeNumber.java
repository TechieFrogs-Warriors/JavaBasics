package TcsPrograms;

import java.util.Scanner;


public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number=check(scanner);
        isPrime(number);//method calling
    }
    public static void isPrime(int num)
    {
        int i,m,flag=0;
        m=num/2;//m is half value of the number
        if(num==0||num==1)
        {
          System.out.println("n is not a prime number");
        

        }
        for(i=2;i<=m;i++)//for loop for factors
        {
            if(num%i==0)//checks if the number is divisible 
            {
                System.out.println("num is not a prime number");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("num is a prime number");
        }
        
    }
    public static int check(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the positive number number");
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

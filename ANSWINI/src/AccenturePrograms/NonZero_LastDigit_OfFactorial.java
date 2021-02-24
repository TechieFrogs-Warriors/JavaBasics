package AccenturePrograms;

import java.util.Scanner;
//program to find non-zero last digit of factorial of a number
public class NonZero_LastDigit_OfFactorial 
{
    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //logic
        int fact=1,nonZeroDigit=1;
        if(n>0)
        {
            //finding factorial
            for(int i=1;i<=n;i++)
            {
                fact = fact * i;
            }
            System.out.println("factorial is: "+fact);
            
            //Logic to find non-zero digit
            nonZeroDigit = fact % 10;
            if(nonZeroDigit == 0)
            {
                fact = Math.abs(fact % 100);
                fact = Math.abs(fact / 10);
                System.out.println("nonzero digit is: "+fact);
            }
            else
            {
                System.out.println("nonzero digit is: "+nonZeroDigit);
            }

        }
        else
        {
            System.out.println("please enter positive number");
            
        }
        sc.close();
        
    }
    
}

package Exception_Concept;

import java.util.Scanner;

public class Program25 
{
    //program for catching exceptions in finally block
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try
        {
            c=a+b;
            System.out.println("sum of a nd b: "+c);
            
        }
        finally
        {
            System.out.println("This is finally block");
            //catching exception in finally block
            try 
            {
                c=a/b;//throws exception if b=0
                System.out.println("Division result is:"+c);
            }
            catch(ArithmeticException e) 
            {
                System.out.println("Arithmetic exception..divide by '0'");
            }
            sc.close();

        }
        
    }
    
}

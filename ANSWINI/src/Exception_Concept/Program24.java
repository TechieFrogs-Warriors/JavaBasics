package Exception_Concept;

import java.util.Scanner;

public class Program24 
{
    //program using nested try catch and finally blocks
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            try
            {
                
                int a=sc.nextInt();//throws exception if entered value is out of int range
                int b=sc.nextInt();//throws exception if entered value is out of int range
                int c=a+b;
                System.out.println("sum of 'a' and 'b' is: "+c);
            }
            catch(Exception e)
            {
                System.out.println("Iam in inner catch block");
                System.out.println("Input mismatch exception");
                
            }
            finally
            {
                System.out.println("Iam inner finally block");
            }
                
        }
        catch(Exception e)
        {
            System.out.println("Iam in outer catch block");
            System.out.println("Input mismatch exception");
        }
        finally
        {
            System.out.println("Iam outer finally block");
            sc.close();
        }
          
    }
    
}

package Exception_Concept;

import java.util.Scanner;

public class Program23 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //try  block
        try
        {
            int a=sc.nextInt();//throws exception if entered value is out of int range
            int b=sc.nextInt();//throws exception if entered value is out of int range
            int c=a+b;
            System.out.println("sum of 'a' and 'b' is: "+c);
        }
        //catch block
        catch(Exception e)
        {
            System.out.println("Input mismatch exception");
            
        }
        //finally block
        finally
        {
            System.out.println("This is final block");
        }

        sc.close();
        
    }
    
}

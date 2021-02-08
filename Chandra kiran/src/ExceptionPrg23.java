public class ExceptionPrg23 
{
    public static void main(String[] args) 
    {
        
        int a=50,b=0,c=1;
        try
        {
           c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            c=a/(b+2);
        }
        finally
        {
            System.out.println("Value of C "+c);
        }
        
    }
    
}

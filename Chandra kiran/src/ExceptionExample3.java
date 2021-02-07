public class ExceptionExample3 
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
            c=a/(b+2);
        }
        finally
        {
            System.out.println(c);
        }
        even(6);
        
    }
   static void even(int n)
    {
        if(n%2==0)
        {
            try
            {
             throw new Exception("Even number");
            }
            catch(Exception e)
            {
                 System.out.println("even number");
            }
            
        }
        else
        {
             System.out.println("odd number");
        }
    }
    
}

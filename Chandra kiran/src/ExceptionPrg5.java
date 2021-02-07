public class ExceptionPrg5 
{
    public static void main(String[] args) 
    {
        
        try
        {
            System.out.println("print the catch");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
    
}

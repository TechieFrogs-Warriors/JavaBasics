public class ExceptionPrg3 
{
    public static void main(String[] args) 
    {
        
        try
        {
            throw new Exception("print the try block");

        }
        catch(Exception e)
        {
            System.out.println("print the catch block");
        }
        
    }
    
}

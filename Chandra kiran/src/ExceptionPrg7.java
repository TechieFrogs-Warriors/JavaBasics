

public class ExceptionPrg7 
{
    public static void main(String[] args) 
    {
        
        try
        {
            
            number();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
          

        }
        
    }
    
    static void number()
    {
        int a=500,b=0;
        try
        {
            a=a/b;

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

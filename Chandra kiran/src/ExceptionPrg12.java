public class ExceptionPrg12 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("Except");

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    
        
    }
    
}

public class ExceptionPrg15 
{
    public static void main(String[] args) 
    {
        
        try
        {
           int a[]= new int[-10];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        
    }
    
}

public class ExceptionPrg20 
{
    public static void main(String[] args) 
    {
        
        try
        {
            int x=Integer.parseInt("30k");
            System.out.println(x);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("30000");
        }
    }
    
}

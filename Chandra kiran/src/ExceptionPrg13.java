public class ExceptionPrg13 
{
    public static void main(String[] args) 
    {
        int a=50,b=0;
        
        try
        {
            a=a/b;


        }
        catch(ArithmeticException e)
        {
            a=a/(b+5);
            System.out.println(e);

        }
        System.out.println(a);
    }
    
}

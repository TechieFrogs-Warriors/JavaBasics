public class ExceptionPrg25 
{
    public static void main(String[] args) 
    {
        int a=50,b=0,c=1;
        try
        {
           c=a/b;
        }
        finally
        {
            c=a/(b+2);
            System.out.println(c);
        }
    }
    
}

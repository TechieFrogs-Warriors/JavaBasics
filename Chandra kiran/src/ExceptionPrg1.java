public class ExceptionPrg1 
{
    public static void main(String[] args) 
    {
        int a=50,b=100,c=0;
        try
        {
            c=a+b;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Add "+c);
    }
    
}

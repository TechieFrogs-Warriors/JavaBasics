public class ExceptionPrg4 
{
    public static void main(String[] args) 
    {
        try
        {
            Even(77);
        }
        catch(Exception e)
        {
            System.out.println("even number");
        }
        
         
    }
    static void Even(int a) throws Exception
    {
        if(a%2==0)
        {
            throw new Exception("Even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
    
}

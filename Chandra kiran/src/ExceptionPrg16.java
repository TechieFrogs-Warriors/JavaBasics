public class ExceptionPrg16 
{
    public static void main(String[] args) 
    {
    
       try
        {
            ExceptionPrg16 obj = new ExceptionPrg16();
            obj.clone();

            throw new CloneNotSupportedException();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.getMessage());
        }
    }  
    
}

public class ExceptionPrg19 
{
    public static void main(String[] args) 
    {
         Object a = new Object();
        
        try
        {
            Integer i=(Integer)a;
            System.out.println(i);
            
        }
        catch(ClassCastException e)
        {
            System.out.println(e);
         }
        
        
        
    }
}

package Exception_Concept;

public class Program5 
{
    //Program to Pass Arguments While Throwing Checked Exception
    public static void main(String[] args) 
    {
        try 
        {
            throw new Exception("passing arguments while throwing an exception");//argument is passed as string message
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}

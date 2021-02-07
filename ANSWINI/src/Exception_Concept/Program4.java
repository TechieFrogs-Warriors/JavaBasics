package Exception_Concept;

public class Program4 
{
    //program using 'throws' exception
    public static void main(String[] args) throws ArithmeticException
    {
        try
        {
        int a=4,b=0,c=a/b;
        System.out.println(c);//throws exception
        }
        catch(Exception e)
        {
            System.out.println("Arithmatic exception occured");
        }
        
    }
    
}

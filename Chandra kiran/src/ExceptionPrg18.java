public class ExceptionPrg18 
{

    public static void main(String[] args) 
    {
        int s=70;
        
        Even(s);
        

    }
    static void Even(int a)
    {
        try
        {   
            if(a<0||a>100)
            {
                 throw new IllegalArgumentException("the numbershoud be positive");

            }
            if(a%2==0)
             System.out.println("Even number "+a);
        }
        catch(IllegalArgumentException e)
        {

            System.out.println(e);
        }
    }
}

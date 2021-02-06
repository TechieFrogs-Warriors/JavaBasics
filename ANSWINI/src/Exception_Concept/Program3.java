package Exception_Concept;

public class Program3 
{
    static void add(int a, int b)
    {
        int c=a+b;
        if(a==2 && b==3)//throws exception if condition is satisfied
        {
            throw new ArithmeticException("Manually throwed exception using 'throw' ");
        }
        else
        {
            System.out.println(c);
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Example of using 'throw' ");
        add(2,3);//passing values to method
        
    }
    
}

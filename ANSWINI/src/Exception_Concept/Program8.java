package Exception_Concept;

public class Program8 
{
    //Program to Use Handle the Exception With Overloaded Methods
    static void method(int i) 
    {
        try
        {
            System.out.println("Iam in int method");
            System.out.println(i/0);//throws exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is arithmatic Exeption..divide by '0'");
        }
        
    }
    static double method(int x, double y) 
    {
        System.out.println("Iam in int double method");
        return x + y ;
    }
    static double method(double x, double y) 
    {
        System.out.println("Iam in double double method");
        return x + y - 5;
    
    }
    public static void main(String[] args) 
    {
        
        try 
        {
            System.out.println(method(15, 25.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(100.50, 200.100));
            method(10);
        } 
        catch(Exception e) 
        {
           System.out.println("exception occoured: "+ e);
        }
    }
}

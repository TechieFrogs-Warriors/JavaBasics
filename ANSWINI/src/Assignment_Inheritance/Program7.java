package Assignment_Inheritance;

public class Program7 
{
    public static void main(String[] args) 
    {
        SubCounter sub=new SubCounter();
        sub.increment();
        
    }
    
}
class Counter
{
    static int  i;//class variable i
    void increment()//method
    {
        for(i=1;i<=3;i++)
        {
            if(i==3)
            System.out.println("i = "+i);
        }
    }
}
class SubCounter extends Counter//subclass inheriting parent class
{
    
}

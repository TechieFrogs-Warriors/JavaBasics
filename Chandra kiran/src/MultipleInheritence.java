interface Even1
{
    
    void even();
}
interface Odd1
{
    void odd();
}
class Numeric1 implements Even1,Odd1
{
    public void even()
    {
        int i,n=10;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even "+i);
            }
        }

    }
    public void odd()
    {
        int j,n=10;
        for(j=1;j<=n;j++)
        {
            if(j%2==1)
            {
                System.out.println("Odd "+j);
            }
        }
    }
}
public class MultipleInheritence 
{
    public static void main(String[] args) 
    {
        Numeric1 obj = new Numeric1();
        obj.even();
        obj.odd();
        
    }
    
}

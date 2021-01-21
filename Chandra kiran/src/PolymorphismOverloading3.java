class Operation
{
    static void operator(int n,String s)
    {
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+s);
            }
        }
    }
    static void operator(String s,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(i%2==1)
            {
                System.out.println(i+s);
            }
        }
    }
    static void operator(int a,long b)
    {
        System.out.println(a*b);
    }
    static void operator(int a,double c)
    {
        System.out.println(a+c);
    }

}
public class PolymorphismOverloading3 
{
    public static void main(String[] args) 
    {
        Operation.operator(20, "Even");
        Operation.operator("Odd", 20);
        Operation.operator(70, 8000);
        Operation.operator(6000, 789.988);
        
    }
    
}

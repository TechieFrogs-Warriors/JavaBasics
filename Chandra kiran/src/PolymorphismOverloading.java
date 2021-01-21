class Average1
{

    static int  average(int a,int b,int c)
    {
        int d=(a+b+c)/3;
        return d;
    }
    static int average(int m,int n,int l,int o)
    {
        int p=(m+n+l+o)/4;
        return p;
    }
}
public class PolymorphismOverloading 
{
    public static void main(String[] args) 
    {
        
        System.out.println(Average1.average(550, 600, 700));
        System.out.println(Average1.average(490, 600, 750, 900));
        
    }
    
}

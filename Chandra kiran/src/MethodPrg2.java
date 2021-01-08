class Demo
{
    public int sum(int n,char c)
    {
       c='a';
       n=7;
       return n;
    }
   public char sum(char c,int n )
   {
       c='b';
       n=50;
       return c;
   }

}
public class MethodPrg2 
{
    public static void main(String[] args) 
    {
        
    
    Demo sum1=new Demo();
    int d=sum1.sum(27, 'B');
    System.out.println(d);
    char g=sum1.sum('C', 45);
    System.out.println(g);

    } 
}

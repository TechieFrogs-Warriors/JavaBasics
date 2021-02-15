public class ExceptionPrg22 
{
    public static void main(String[] args) 
    {

            int a=200,b=1,i=0;
            String S=null;
            int d[]=new int[10];
        try
        { 
            b=a/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(b);
        try
        {
            System.out.println(S.length());
        }
        catch(NullPointerException c)
        {
            System.out.println(c);
             S="chandra";
        }
        System.out.println(S.length());
        try 
        {
            System.out.println(d[10]);
        }
        catch(ArrayIndexOutOfBoundsException g)
        {
            System.out.println(g);
            System.out.print(d[9]);
        }
    
    }
    
}

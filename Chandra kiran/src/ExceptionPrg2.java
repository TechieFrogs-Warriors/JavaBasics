public class ExceptionPrg2 
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
        System.out.println("value "+b);
        try
        {
         System.out.println(S.length());
        }
         catch(NullPointerException c)
         {
              S="chandra";
         }
         System.out.println("Length "+S.length());
        try 
        {
         System.out.println(d[10]);
        }
       catch(ArrayIndexOutOfBoundsException g)
        {
            System.out.print("Array "+d[9]);
         }
    }
    
}

public class EXceptionPrg8 
{
   static void sample(int a)
    {
        System.out.println(a/0);
    }
     static void sample(int a,int b)
    {
        System.out.println(a/b);
    }
    static  void sample(int a,int b,int c)
    {
        c=a/b;
        System.out.println(c);
    }
     public static void main(String[] args) 
      {
        
          try
          {
             
               sample(700,7);
               sample(70);
               sample(50, 0, 1);
       
           }
          catch(ArithmeticException e)
          {
              System.out.println(e);
          }
      }
}

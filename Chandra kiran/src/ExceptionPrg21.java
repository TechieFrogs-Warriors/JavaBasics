public class ExceptionPrg21 
{
    public static void main(String[] args) 
    {
        
        int a=100,b=0;
        int c[]= new int[10];
         try
         {
              c[9]=a/b; 
              c[10]=c[9];
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
              c[8]=c[9];
              System.err.println("arraybounds");
         }
         catch(ArithmeticException e)
         {
            c[9]=a/(b+2);
         }
         
          catch(Exception e)
          {
              System.out.println("rest of code");
          }
          System.out.println("Value of C "+c[9]);
         
        
    }
    
}

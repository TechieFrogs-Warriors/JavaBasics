public class ExceptionPrg6 
{
    public static void main(String[] args) 
    {
         int a=100,b=0;
         int c[]= new int[10];
        
         try
         {
              c[9]=a/b;
               try
               {
                   c[10]=c[9];
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    c[8]=c[9];
                    System.out.println("arraybounds");
                }
            }
            catch(ArithmeticException e)
            {
                c[9]=a/(b+2);
            }
            System.out.println("value of c "+c[9]);
    }
    
}

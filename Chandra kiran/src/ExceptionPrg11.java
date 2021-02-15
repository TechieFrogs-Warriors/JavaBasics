public class ExceptionPrg11 
{
    public static void main(String[] args) 
    {

         
        int a=100,b=0;
        int c[]= new int[10];
       
        try
        {
            
             c[10]=c[9];
             c[9]=a/b;
        }
        catch(ArithmeticException e)
        {
            c[9]=a/(b+2);
         }
        catch(ArrayIndexOutOfBoundsException e)
        {
            c[8]=c[9]+100;
            System.out.println("arrayboundsout");
        }
        System.out.println("value of c "+c[8]);
        

    }
    
}

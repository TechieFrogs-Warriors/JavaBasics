/*class NestOut
{

  public static class NestIn
    {
         void print()
        {
            System.out.println("print the inner class");
        }
        
        
    }
}
public class NestedClass 
{
   public static void main(String[] args) 
   {
       NestOut.NestIn n= new NestOut.NestIn();
       n.print();
    }
}
 */   



class Nest
{

   class NestIn
    {
        
         void print()
        {
            System.out.println("print the inner class");
        }
        
        
    }
}
 class Inner
{
    public static void main(String[] args) 
    {
       Nest.NestIn p =new Nest().new NestIn(); 
       p.print();
    }

}

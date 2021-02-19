abstract class Super
{
   public Super()
    {
        System.out.println("This is constructor of abstract class");

    }
   public abstract void a_method();
   public void Normal()
   {
       System.out.println("This is a normal method of abstract class");
   }

}
class Subclass extends Super
{
    public void a_method()
    {
        System.out.println("This is abstract method");
    }
}
public class AbstractPrg4 
{
    public static void main(String[] args) 
    {
        Subclass obj = new Subclass();
        obj.a_method();
        obj.Normal();
        
    }
    
}

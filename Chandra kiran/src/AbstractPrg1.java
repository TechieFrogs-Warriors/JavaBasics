abstract class Parent
{
   public void message()
    {
        System.out.println("This is Parent class");

    }
}
class child1 extends Parent
{
    public void message()
    {
      System.out.println("This is First Subclass");
    }

}
class Child2 extends Parent
{
    public void message()
    {
        System.out.println("This is Second Subclass");
    }
}
public class AbstractPrg1 
{
    public static void main(String[] args) 
    {
        child1 obj = new child1();
        Child2 obj1 = new Child2();
        obj.message();
        obj1.message();
        
    }
    
}

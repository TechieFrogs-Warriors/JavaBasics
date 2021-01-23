abstract class Animals
{
    public abstract void cats();
    public abstract void dogs();
}
class Cats extends Animals
{
    public void dogs()
    {

    }
    public void cats()
    {
        System.out.println("Cats meow");
    }
}
class Dogs extends Animals
{
    public void cats()
    {

    }
    public void dogs()
    {
        System.out.println("Dogs bark");
    }
}
public class AbstractPrg5 
{
    public static void main(String[] args) 
    {
        Cats obj = new Cats();
        Dogs obj1 = new Dogs();
        obj.cats();
        obj1.dogs();
        
    }
    
}

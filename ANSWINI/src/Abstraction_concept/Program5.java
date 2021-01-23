package Abstraction_concept;
public class Program5 
{
    public static void main(String[] args) 
    {
        Cats c=new Cats();
        c.cats();
        Dogs d=new Dogs();
        d.dogs();
        
    }
}
abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats Meow");
    }

    @Override
    void dogs() {
        // TODO Auto-generated method stub

    }
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("Dogs Bark");
    }

    @Override
    void cats() {
        // TODO Auto-generated method stub

    }
}

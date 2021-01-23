package Abstraction_concept;

public class Program4 
{
    public static void main(String[] args) 
    {
        Subclass sub=new Subclass();
        sub.display();//normal method of abstract class is called here
        sub.a_method();//abstract method  is called here
        //in the output superclass constructor will be displayed first
    }
    
}

abstract class All
{
    All()
    {
        System.out.println("this is abstract class constructor");
    }
    abstract void a_method();//abstract method
    void display()
    {
        System.out.println("this is normal method of abstract class");
    }
}
class Subclass extends All
{
    void a_method()
    {
        System.out.println("this is abstract method");
    }

}

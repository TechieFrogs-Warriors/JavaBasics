package Abstraction_concept;

public class Program1 
{
    public static void main(String[] args) 
    {
        Child1 ch1=new Child1();
        ch1.message();
        Child2 ch2=new Child2();
        ch2.message();
        
    }
    
}
abstract class Parent
{
    void message()
    {
        System.out.println("this is super abstract class message method");
    }
}
class Child1 extends Parent
{
    void message()
    {
        System.out.println("this is first child class message method");
    }
}
class Child2 extends Parent
{
    void message()
    {
        System.out.println("this is second child class message method");
    }

}

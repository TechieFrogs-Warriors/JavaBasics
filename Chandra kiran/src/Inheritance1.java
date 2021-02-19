class Parent2
{
    void parent()
    {
        System.out.println("This is Parent Class");
    }
}
class Child extends Parent2
{
    void child ()
    {
        System.out.println("This is Child Class");
    }
}
public class Inheritance1 
{
    public static void main(String[] args) 
    {
      Parent2 Obj = new Parent2();
      Child Obj1 = new Child();
      Obj.parent();
      Obj1.child();
      Obj1.parent();

        
    }
    
}

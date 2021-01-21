class Parent
{
    void parent()
    {
        System.out.println("This is Parent Class");
    }
}
class Child extends Parent
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
      Parent Obj = new Parent();
      Child Obj1 = new Child();
      Obj.parent();
      Obj1.child();
      Obj1.parent();

        
    }
    
}

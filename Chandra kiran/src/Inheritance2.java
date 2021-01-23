class Parent1
{
    private void parent()
    {
        System.out.println("This is Parent Class");
    }
}
class Child1 extends Parent1
{
    void child ()
    {
        System.out.println("This is Child Class");
    }
}
public class Inheritance2 
{
    public static void main(String[] args) 
    {
      Parent1 Obj = new Parent1();
      Child1 Obj1 = new Child1();
      Obj.parent();
      Obj1.child();
      Obj1.parent();

        
    }
    
}

class Numbers2
{
    int a=100;
   public void display()
    {
        System.out.println("Parent Display method");
    }
}
 

class Evennumber extends Numbers2 
{
    public void display() 
    {
        System.out.println("Child Display method ");
    }
   void  even()
   {
       System.out.println("Print even numbers");
   }

}

public class UpcastingExample 
{
    public static void main(String[] args) 
    {
    
        Numbers2 obj = new Evennumber();
        obj.display();
        System.out.println(obj.a);
    }
    
}

class Numbers3
{
   public void display()
    {
        System.out.println("Parent Display method");
    }
}
 

class Evennumber2 extends Numbers3 
{
    public void display() 
    {
        System.out.println("Child Display method ");
    }
   
    void even()
   {
       System.out.println("Print even numbers");
   }

}


public class DownCastingExample 
{
    public static void main(String[] args) 
    {

        Numbers3 obj =new Evennumber2();
    
        if(obj instanceof Evennumber2)
        {
            ((Evennumber2) obj).even();;
        }
    }
    
}

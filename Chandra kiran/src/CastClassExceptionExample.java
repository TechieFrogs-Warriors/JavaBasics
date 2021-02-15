class Numbers4
{
   public void display()
    {
        System.out.println("Parent Display method");
    }
}
 

class Evennumber3 extends Numbers4
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

public class CastClassExceptionExample 
{
    public static void main(String[] args) 
    {

        Numbers4 obj =new Numbers4();
        Evennumber3 obj1=(Evennumber3)obj;
        
    
        
    }
    
}

public interface UpcastingExample1
{ 
    int b=70;
    void display();
}

class Evennumber1  implements UpcastingExample1
{
    public void display() 
    {
        System.out.println("Child Display method ");
    }
   void  even()
   {
       System.out.println("Print even numbers");
   }

public static void main(String[] args) 
{
    UpcastingExample1 obj =new Evennumber1();
    obj.display();
    System.out.println(b);
    
}
}



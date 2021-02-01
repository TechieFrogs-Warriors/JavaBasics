 interface Add
{
    final int x=100;
   static String s="Print";
   void add();
  default void Multiply()
    {
        System.out.println("default method");
    }
    default void Adder()
    {
        System.out.println("default Adder");

    }
 
}
interface Multiplication extends Add
{
    void multiply();
  public  class A
    {
        A()
        {
            System.out.println("Print the constructor");

        }
        
    }
}
interface Subtraction extends Multiplication
{
    
    void subtract();
    void subtract(int a);
}
interface Division extends Subtraction
{
  public interface Divide
    {
        void divided();
       
    }
    public void divide();

}

 class Arthimatic implements  Division
{
    interface test
    {
        int j=400;
        
    }
   public void add()
    {
        
        int a=70,b=70,c;
        c=a+b+x;
        System.out.println("Addition "+c);
        System.out.println("X value "+x);
    }
    public void multiply()
    {
        int a=45,b=85,c;
        c=a*b;
        System.out.println("Multiplication "+c);
    }
  public  void subtract()
    {
        int n=200-x;
        
        System.out.println("subtraction "+n);

    }
    public void subtract(int a)
    {
        
        System.out.println(a);

    }
    public void divide()
    {
        
        String m=s+x;
        System.out.println("division "+m);
    }

}
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Arthimatic obj = new Arthimatic();
        Add obj1 = new Arthimatic();
        obj1.add();
        obj1.Multiply();
        obj1.Adder();
        obj.add();
        obj.multiply();
        obj.subtract();
        obj.subtract(80);
        obj.divide();
        
        
    }
    
}

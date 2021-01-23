 abstract  class Run
{
   public abstract void add();
  // private abstract void Multiplication();
  // final abstract void Division();
  // static abstract void Modulus();
  public  Run()
    {
       System.out.println("print the run");
    }
   final int subtraction()
   {
       int d=20,e=80,f;
       f=e-d;
       return f;
   } 
   public abstract void add(int g);
   protected abstract int Multiplication(int m,int n);
}
class stop extends Run
{
  public  void add()
    {
        int a=30,b=70,c;
        c=a+b;
        System.out.println("Addition "+c);

    }
    public void add(int g)
    {
        int h=g+100;
        System.out.println("Add "+h);

    }
    protected int Multiplication(int m,int n)
    {
        int o=m*n;
        return o;
    }
}

abstract class AbtractExample1 
{
    public static void main(String[] args) 
    {
        Run obj = new stop();
        stop obj1 = new stop();
       // Run Obj2= new Run();
        obj.add();
        System.out.println("Subtraction "+obj.subtraction());
        obj1.add();
        obj.add(78);
        System.out.println("Multiplication "+obj.Multiplication(50, 50));
        
    }
    
}

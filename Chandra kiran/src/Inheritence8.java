class A1
{
    int i=100;
    int j=200;
    A1()
    {
        System.out.println(i);
    }
   void show()
   {
       System.out.println(j);
   }
}
class B1 extends A1
{
    int k=500;
    B1()
    {

    }
    void show()
    {
       System.out.println(k);
    }
}
public class Inheritence8 
{
    public static void main(String[] args) 
    {
        B1 Obj = new B1();
        Obj.show();

        
    }
    
}

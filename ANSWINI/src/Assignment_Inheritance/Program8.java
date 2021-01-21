package Assignment_Inheritance;

public class Program8 
{
    public static void main(String[] args) 
    {
        B b=new B();
        b.show();//overrides parent class show method.
    }
    
}
class A
{
    int i=2,j=4;
    A()
    {

    }
    void show()
    {
        System.out.println("i and j are: "+i+" "+j);
    }
}
class B extends A
{
    int k=5;
    B()
    {

    }
    void show()
    {
        //super.show();//if parent show method also needed to be printed
        System.out.println("k value is: "+k);
    }

}

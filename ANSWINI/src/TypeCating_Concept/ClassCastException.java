package TypeCating_Concept;

public class ClassCastException 
{
    public static void main(String[] args)
    {
        A a = new B();   //B type is auto up casted to A type
        System.out.println(a.i);
        B b = (B) a;     //A type is explicitly down casted to B type.
        System.out.println(b.i);
        System.out.println(b.j);
       // B b1=new C();//this upcasting has to be done for the next statemnets to no to throw class cast Exception
        C c = (C) b;    //Here, you will get class cast exception
        System.out.println(c.i);
        System.out.println(c.j);
        System.out.println(c.k);
        
    }
    
}

class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}

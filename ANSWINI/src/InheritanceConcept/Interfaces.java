package InheritanceConcept;
import Abstraction_concept.*;
import Interface_Concept.Program7.*;
import AccessModifers.ProtectedSample;
import AccessModifers.ProtectedSample.*;

public class Interfaces  extends ProtectedSample
{
    public static void main(String[] args) 
    {
        Mathematics maths=new Mathematics();
        maths.add();
        maths.subtract();
        System.out.println(maths.mul());
        //Interface concept program 7 part3
        Interfaces i=new Interfaces();
        System.out.println(i.getBaseInner().Talk());
    }
    //Interface concept program 7 part3
    Prog7BaseInner getBaseInner() 
    { 
        return this.new Prog7BaseInner();
    }
    
}

//public or abstract can be used for mrthods in interfaces
interface A
{
    void add();//abstract method....no implementation should be done here
}
interface B
{
    void subtract();//abstract method....no implementation should be done here
}

interface C extends A,B
{
    abstract void add();//abstract method....no implementation should be done here

    int mul();//abstract method....no implementation should be done here

}
class Mathematics implements C
{
    public void subtract()//public is must
    {
        int a=50;
        int b=40;
        int c=a-b;
        System.out.println(c);
    }
    public void add()//overrides A's add method
    {
        int a=50;
        int b=40;
        int c=a+b;
        System.out.println(c); 
    }
    public int mul()
    {
        int a=5;
        int b=4;
        int c=a*b;
        return c;
    }

}

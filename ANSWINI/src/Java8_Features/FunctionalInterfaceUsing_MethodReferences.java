package Java8_Features;
//program to know how to implement functional interface using method reference(referring static method case)
public class FunctionalInterfaceUsing_MethodReferences 
{
    //driver class
    public static void main(String[] args) 
    {
        
        //since functional interface implementing class has STATIC method.we call it directly by classname itself
        //interfacename objname = interface_implementing_classname :: methodname;
        Mreference obj = MreferenceImplementing :: sum;
        System.out.println(obj.sum(10, 20)); //prints the sum

        
    }
    
}

//functional interface(will have only one abstract method)
@FunctionalInterface
interface Mreference
{
    public int sum(int a,int b);
}

//implementing functional interface using(static) METHOD REFERENCE in a class
class MreferenceImplementing
{
    public static int  sum(int a,int b) 
    {
        return a+b;
        
    }
}

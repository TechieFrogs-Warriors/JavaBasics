package Java8_Features;
//program to know how to implement functional interface using method reference(referring instance method case)
public class FunctionalInterfaceUsing_MethodReference2 
{
    public static void main(String[] args) 
    {
        //since functional interface implementing class has INSTANCE method.we call it by creating object.
        //interfacename objname = new interface_implementing_classname() :: methodname;
        MethodReference2 obj = new MreferenceImplementing2() :: sum;
        System.out.println(obj.sum(10, 20));
        
    }
    
}

//creating functional interface
@FunctionalInterface
interface MethodReference2
{
    
    public int sum(int a,int b);

}

//implementing functional interface using METHOD REFERENCE in a class
class MreferenceImplementing2
{
    public int  sum(int a,int b) 
    {
        return a+b;
        
    }
}

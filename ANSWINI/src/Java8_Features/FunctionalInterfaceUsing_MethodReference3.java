package Java8_Features;
//program to know how to implement functional interface using method reference(referring constructor)
public class FunctionalInterfaceUsing_MethodReference3 
{
    public static void main(String[] args) 
    {
        //since functional interface implementing class has constructor .we call it by creating object.
        //interfacename objname = interface_implementing_classname :: new;
        MethodReference3 obj = MreferenceImplementing3 :: new;
        obj.sum(10, 20);//prints sum
        
    }
    
}

//creating functional interface
@FunctionalInterface
interface MethodReference3
{
    
    public void sum(int a,int b);

}

//implementing functional interface using(constructor) METHOD REFERENCE in a class
class MreferenceImplementing3
{
    MreferenceImplementing3(int a,int b) //constructor
    {
        System.out.println(a+b);
        
    }
}



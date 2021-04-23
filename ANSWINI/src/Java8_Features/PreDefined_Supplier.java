package Java8_Features;

import java.util.function.Supplier;

//Pre-defined Supplier
public class PreDefined_Supplier 
{
    public static void main(String[] args) 
    {
        //Using supplier interface and getting a string object
        Supplier<String> supobj = () -> "Answini";
        //calling using get() method
        System.out.println(supobj.get());

    }
    
}



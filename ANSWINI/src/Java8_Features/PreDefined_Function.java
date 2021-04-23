package Java8_Features;
//Pre-defined Function
import java.util.function.Function;

public class PreDefined_Function 
{
    public static void main(String[] args) 
    {
        //calling the function by creating object that function class
        //Function is pre-defined functional interface which contains single abstract method called as apply()
        //apply() will take single argument as i/p and return value
        Function<Integer,String> obj = new NumberValidation() :: validate;
        //using apply method
        System.out.println(obj.apply(5));

        
    }
    
}

//Normal class with a function type function(i.e method only)
class NumberValidation
{
    //FUNCTION with one argument
    String validate(int num)
    {
        if(num%2==0)
            return "even number";
        else 
            return "odd number";
    }
}

package Java8_Features;
//Pre-defined BiFunction

import java.util.function.BiFunction;

public class PreDefined_BiFunction 
{
    public static void main(String[] args) 
    {
        //calling the Bifunction by creating object that Bifunction class
        //BiFunction is pre-defined functional interface which contains single abstract method called as apply()
        //apply() will take two arguments as i/p and return value
        BiFunction<Integer,Integer,String> obj = new NumberValidation2() :: validate;
        //using apply() method
        System.out.println(obj.apply(5,4));
        
    }
    
}

//Normal class with a Bifunction Type function(i.e method only)
class NumberValidation2
{
    //BiFUNCTION with two argument
    String validate(int num1,int num2)
    {
        if(((num1+num2)%2)==0)
            return "even number";
        else 
            return "odd number";
    }
}

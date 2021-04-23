package Java8_Features;

import java.util.function.Predicate;

//Pre-defined predicate
public class PreDefined_Predicate 
{
    public static void main(String[] args) 
    {

        //calling the Predicate by creating object that function class
        //Predicate is pre-defined functional interface which contains single abstract method called as test()
        //test() will take single argument as i/p and  return boolean value

        Predicate<Integer> obj = new NumberValidation5() :: validate;
        //using test() method
        System.out.println(obj.test(5));
    }
}

//Normal class with a Predicate Type function(i.e method only)
class NumberValidation5
{
    //Predicate with one argument
    boolean validate(int num1)
    {
        if((num1%2)==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
}

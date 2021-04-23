package Java8_Features;

import java.util.function.BiPredicate;

//PreDefined BiPredicate
public class PreDefined_BiPredicate 
{
    public static void main(String[] args) 
    {
        //calling the BiPredicate by creating object that function class
        //BiPredicate is pre-defined functional interface which contains single abstract method called as test()
        //test() will take Two arguments as i/p and  return boolean value

        BiPredicate<Integer,Integer> obj = new NumberValidation6() :: validate;
        //using test() method
        System.out.println(obj.test(5,5));
        
    }
}


//Normal class with a BiPredicate Type function(i.e method only)
class NumberValidation6
{
    //BiPredicate with two argument
    boolean validate(int num1,int num2)
    {
        if(((num1+num2)%2)==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
}

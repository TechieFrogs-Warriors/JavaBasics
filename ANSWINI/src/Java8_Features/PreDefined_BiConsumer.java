package Java8_Features;
//Pre-defined BiConsumer 
import java.util.function.BiConsumer;

public class PreDefined_BiConsumer 
{
    public static void main(String[] args) 
    {
        
        //calling the Consumer by creating object that function class
        //BiConsumer is pre-defined functional interface which contains single abstract method called as accept()
        //accept() will take Two argument as i/p and does not return value
        BiConsumer<Integer,Integer> obj = new NumberValidation4() :: validate;
        //using accept() method
        obj.accept(5,5);
    }
    
}

//Normal class with a BiConsumer Type function(i.e method only)
class NumberValidation4
{
    //BiConsumer with two argument
    void validate(int num1,int num2)
    {
        if(((num1+num2)%2)==0)
        {
            System.out.println( "even number");
        }
        else 
        {
            System.out.println("odd number");
        }
        
    }
}
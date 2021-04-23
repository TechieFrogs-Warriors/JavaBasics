package Java8_Features;
//Pre-defined Consumer 
import java.util.function.Consumer;

public class PreDefined_Consumer 
{
    public static void main(String[] args) 
    {

        //calling the Consumer by creating object that function class
        //Consumer is pre-defined functional interface which contains single abstract method called as accept()
        //accept() will take single argument as i/p and does not return value
        Consumer<Integer> obj = new NumberValidation3() :: validate;
        //using accept() method
        obj.accept(5);
    }
    
}


//Normal class with a Consumer Type function(i.e method only)
class NumberValidation3
{
    //Consumer with one argument
    void validate(int num1)
    {
        if((num1%2)==0)
        {
            System.out.println( "even number");
        }
        else 
        {
            System.out.println("odd number");
        }
        
    }
}

package Java8_Features;

import java.util.Optional;
//How to avoid nullpointer exception in java8 feature
public class NullcheckPractice 
{
    public static void main(String[] args) 
    {
        System.out.println("----------------by giving some input without null---------------");
        String s ="aswini";
        Optional<String> op = Optional.ofNullable(s);
        if(op.isPresent())//checks if data is present or not.If true enters loop
        {
            System.out.println(op.get());
        }
        else //if null is passed 
        {
            System.out.println("please pass data");
        }
        System.out.println("-------------------by giving null input--------------------------");
        String s2 = null;
        Optional<String> op2 = Optional.ofNullable(s2);
        if(op2.isPresent())//checks if data is present or not.If true enters loop
        {
            System.out.println(op.get());
        }
        else //if null is passed 
        {
            System.out.println("please pass data");
        }
        
    }
    
}

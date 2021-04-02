package Collections;

import java.util.*;

public class SetPractice 
{
    public static void main(String[] args) 
    {
        //creating a set object
        Set<Integer> numbers = new HashSet<>();
        //Adding Elements to the set(if duplicates are there set takes only one time)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(null);

        //Printing  set elements
        //set will print unordered elements by eleiminating duplicate values
        Iterator<Integer> i= numbers.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        
    }
    
}

package Collections;

import java.util.*;

public class LinkedHashSetPractice 
{
    public static void main(String[] args) 
    {
        Set<Integer> numbers = new LinkedHashSet<>();
        //Adding Elements to the set(if duplicates are there set takes only one time)
        numbers.add(50);
        numbers.add(80);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(10);
        numbers.add(null);


        //Printing  set elements
        //LinkedHashSet will print Insertion ordered elements by eleiminating duplicate values
        Iterator<Integer> i= numbers.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
    }
    
}

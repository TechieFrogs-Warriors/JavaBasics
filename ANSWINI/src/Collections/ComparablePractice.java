package Collections;

import java.util.ArrayList;
import java.util.*;

public class ComparablePractice 
{
    public static void main(String[] args) 
    {
        //creating a list of Laptop type
        List<Laptop> lap = new ArrayList<>();

        //adding values to list by passing the values to the constructor of laptop class
        lap.add(new Laptop("DELL",30000));
        lap.add(new Laptop("LENNOVO",25000));
        lap.add(new Laptop("ASUS",35000));
        lap.add(new Laptop("APPLE",80000));

        //sorting using inbuilt sort method
        Collections.sort(lap);

        //printing the list in sorted order based on price
        for(Laptop l:lap)
        {
            System.out.println(l);
        }
        
    }
    
}

package Collections;

import java.util.ArrayList;
import java.util.List;

public class AddingNumbers 
{
    public static void main(String[] args) 
    {
        //creating an arraylist
        List<Integer> numbers = new ArrayList<>();

        //logic to add numbers from 1 to 20
        //Entering numbers from 1 to 20 into arraylist
        for(int i=1;i<21;i++)
        {
           numbers.add(i);
           
        }
        //To print complete arraylist elements
        System.out.print(numbers+" ");

        //removing 19th element from arraylist
        numbers.remove(19);
        
        //printing the final elements in the arraylist
        System.out.println();
        System.out.print(numbers+" ");
        
        


        
    }

    
}

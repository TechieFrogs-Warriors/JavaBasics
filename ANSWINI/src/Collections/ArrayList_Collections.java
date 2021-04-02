package Collections;

/* import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List; */
import java.util.*;
public class ArrayList_Collections 
{
    public static void main(String[] args) throws Exception
    {
        //declaring an arraylist and creating an object of its type
        ArrayList<Integer> values = new ArrayList<Integer>();

        //Expanding arraylist size by adding values to it
        values.add(5);
        values.add(25);
        values.add(15);
        values.add(10);
        values.add(35);

        //Shrinking Arraylist size by removing elements from it
        values.remove(2);//removing based on index value
       // values.remove(0);//Even if we take object remove method its taking it as index only

        //To sort the arraylist values
        Collections.sort(values);

        //To add values at a particular position of arraylist
        values.add(2,10);

        //Recent and Advanced way To print the output with values in the arraylist
        //Stream API ..Lambda Expression
        values.forEach(System.out::println);

        // To print the output with values in the arraylist using  'Enhanced foreach loop'
        for(int i:values)
        {
            System.out.println(i);
        }

        //Printing output using 'iterator'
        Iterator i = values.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
    }
    
}

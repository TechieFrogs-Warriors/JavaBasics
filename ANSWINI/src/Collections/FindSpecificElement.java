package Collections;

import java.util.ArrayList;
import java.util.List;

public class FindSpecificElement 
{
    public static void main(String[] args) 
    {
        //Creating arraylist of string type
        List<String> element = new ArrayList<>(11);

        //Adding elements into arraylist

        element.add("a");
        element.add("b");
        element.add("c");
        element.add("d");
        element.add("e");
        element.add("f");
        element.add("g");
        element.add("h");
        element.add("i");
        element.add("j");
        element.add("k");
       
        //To get the 7th element
        System.out.println(element.get(7));
    
    }
    
}

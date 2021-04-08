package Collections;

import java.util.ArrayList;
import java.util.List;

public class UpdateListElement 
{
    public static void main(String[] args) 
    {
        List<String> name = new ArrayList<>();
        //adding elements into the arraylist
        name.add("aswini");
        name.add("achyuth");
        name.add("achyuth");
        name.add("achyuth");
        name.add("achyuth");
        System.out.println(name);
        //to update any element in the arraylist
        name.set(2, "vedansh");
        name.set(3, "vivek");
        name.set(4, "raji");
        System.out.println(name);
        
    }
    
    
}

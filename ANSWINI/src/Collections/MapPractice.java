package Collections;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice 
{
    public static void main(String[] args) 
    {
        //creating a hashmap object
        Map<Integer,String> mymap = new HashMap<>();

        //adding KEY and VALUE are the "ENTRY"  to the haspmap
        
        mymap.put(1, "A");
        mymap.put(2, "B");
        mymap.put(3, null);
        mymap.put(null, null); //can accept null values
        mymap.put(3, "C"); //same key entry will replaces/updates the  old entry
        mymap.put(null, "A");
        mymap.put(4, null);
        mymap.putIfAbsent(6, "D"); //puts the entry only if that key is already not there

        //printing map entry
        //prints in unordered way
        System.out.println(mymap);

        //Another way to print map entry
        for(Map.Entry<Integer, String> mapentry : mymap.entrySet())
        {
            System.out.println(mapentry.getKey()+" : "+mapentry.getValue());
        }

        //to print only keys
        System.out.println(mymap.keySet());
        //to print only values
        System.out.println(mymap.values());

        //to get a particular entry based on key
        System.out.println(mymap.get(3));

        
    }
    
}

package Collections;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapPractice 
{
    public static void main(String[] args) 
    {
        //creating a hashmap object
        Map<Integer,String> mymap = new TreeMap<>();

        //adding KEY and VALUE are the "ENTRY"  to the haspmap
        
        mymap.put(5, "A");
        mymap.put(2, "B");
       // mymap.put(3, null); //throws null pointer exception,because treemap dont accept null values
        //mymap.put(null, null); //throws null pointer exception,because treemap dont accept null values
        mymap.put(3, "C"); //same key entry will replaces/updates the  old entry
       // mymap.put(null, "A"); //throws null pointer exception,because treemap dont accept null values
       // mymap.put(1, null); //throws null pointer exception,because treemap dont accept null values
        mymap.putIfAbsent(6, "D"); //puts the entry only if that key is already not there

        //printing map entry
        //prints in Ascending order way
        System.out.println(mymap);

        // if we want iterator to loop through map
        //  Iterator<Entry<Integer, String>> obj =mymap.entrySet().iterator();

       
        //Another way to print map entry
        for(Entry<Integer, String> mapentry : mymap.entrySet())
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

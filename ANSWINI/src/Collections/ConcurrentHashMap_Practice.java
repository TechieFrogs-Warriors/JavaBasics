package Collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_Practice 
{
    public static void main(String[] args) 
    {
        //creating a hashmap object
        Map<Integer,String> mymap = new ConcurrentHashMap<>();

        //adding KEY and VALUE are the "ENTRY"  to the haspmap
        
        mymap.put(1, "A");
        mymap.put(2, "B");
        //mymap.put(3, null); //Throws null-pointer exception
        //mymap.put(null, null); //Throws null-pointer exception
        mymap.put(3, "C"); //same key entry will replaces/updates the  old entry
        //mymap.put(null, "A"); //Throws null-pointer exception
        //mymap.put(4, null); //Throws null-pointer exception
        mymap.putIfAbsent(6, "D"); //puts the entry only if that key is already not there

        //printing map entry
        //prints in unordered way
        System.out.println(mymap);


        System.out.println("-------------------------------------");
        //concurrenthashmap is fail-safe so multiple threads can run at a time
        //(while printing..adding element can also be done)
        Iterator<Map.Entry<Integer, String>> obj = mymap.entrySet().iterator();
        while(obj.hasNext())
        {
            System.out.println(obj.next());
            mymap.put(7, "Bye");
        }

        System.out.println("-------------------------------------");

        //Another way to print map entry
        for(Map.Entry<Integer, String> mapentry : mymap.entrySet())
        {
            System.out.println(mapentry.getKey()+" : "+mapentry.getValue());
        }
        
    }
    
}

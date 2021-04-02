package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTablePractice 
{
    public static void main(String[] args) 
    {
        //creating hash table object
        Hashtable<Integer,String> myhash = new Hashtable<>();

        //adding elements to hash table
        myhash.put(10, "c");
        myhash.put(30, "a");
        myhash.put(20, "b");
        myhash.put(50, "e");
        myhash.put(40, "d");
        myhash.put(10, "f"); //will replace entry with same key
        //myhash.put(null, "c");//Throws null-pointer exception
        //myhash.put(60, null);//Throws null-pointer exception

        //printing using iterator method
        //in iterator hashtable is synchronized and fail-fast(you cannot add element while you print) 
        /* Iterator<Map.Entry<Integer,String>> it = myhash.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            myhash.put(80, "g");
        } */
        //printing using iterator method
        //In Enumeration hashtable is synchronized and fail-safe(you can add element while you print) 
        Enumeration e =myhash.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
            myhash.put(80, "g");
        }


        
    }
    
}

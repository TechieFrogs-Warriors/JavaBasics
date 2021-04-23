package Java_Interview_programs;

import java.util.LinkedHashMap;
import java.util.Map;

//program to find duplicate charcters in a string
public class DuplicateCharacters {
    public static void main(String[] args) {
        
		LinkedHashMap<Character,Integer> lmp=new LinkedHashMap<Character,Integer>();
		String s="aswini";
		char[] c = s.toCharArray();

		for(Character myChar:c)
		{
			if(lmp.containsKey(myChar))
			{
				lmp.put(myChar,lmp.get(myChar)+1);
			}
			else
			{
				lmp.put(myChar,1); 
			}
		}

        System.out.println("Duplicate characters in the string< " +s+" >are: ");
		for(Map.Entry<Character,Integer> me:lmp.entrySet())
		{
			if(me.getValue()>1)
			{
				System.out.print(me.getKey()+" ");
			}
		}
    }
}

package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxRepeatedWordInStriing 
{
    public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> mp=new LinkedHashMap<String,Integer>();
		String s="welcome to java welcome to java";
        String[] words = s.split(" ");

		for(String myWord:words)
		{
			if(mp.containsKey(myWord))
			{
				mp.put(myWord,mp.get(myWord)+1);
			}
			else
			{
				mp.put(myWord,1); 
			}
		}
		String myKey = " ";
		int val = 0;
		for(Map.Entry<String,Integer> me:mp.entrySet())
		{
			if(me.getValue()>val)
			{
				myKey = me.getKey();
				val = me.getValue();
			}
		}
		System.out.println(myKey+"-"+val);
		
	}	
    
}

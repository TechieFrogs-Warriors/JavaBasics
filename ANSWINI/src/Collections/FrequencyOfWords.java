package Collections;

import java.util.LinkedHashMap;

public class FrequencyOfWords 
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
		System.out.println(mp);
	}	
    
}

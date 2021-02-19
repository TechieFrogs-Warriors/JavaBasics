package StringsConcept;
import java.util.Scanner;

public class Program42 
{
    public static void main(String[] args) 
	{     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String st=sc.nextLine();
        st=st.toLowerCase();
        String words[]=st.split(" ");
        
        String word = "";    
        int  maxCount = 0;
        
        for(int i = 0; i < words.length; i++)
		{    
            int count = 0;   
            for(int j = i+1; j < words.length; j++)
			{    
                if(words[i].equals(words[j]))
				{    
                    count++;    
                }     
            }    
            if(count > maxCount)
			{    
                maxCount = count;    
                word = words[i];    
            } 
              
        }
        if(maxCount==0)
        System.out.println("No word in the string is repeating");
        else
        System.out.println("Most repeated word in the string is: " + word);    
        sc.close();    
    }    
    
}

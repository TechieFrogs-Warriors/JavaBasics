package StringsConcept;

import java.util.Scanner;

public class Program36 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String st=sc.nextLine();
        st=st.toLowerCase();
        int count[]=new int[st.length()];
        char minChar=st.charAt(0);
        char maxChar=st.charAt(0) ; 
        //converts given string 'st' into character array 'ch'
        char ch[]=st.toCharArray(); 
        int  maxCount=count[0];
        int  minCount=count[0];

        for(int i = 0; i < ch.length; i++)
		{    
            count[i] = 1;   
            for(int j = i+1; j < ch.length; j++)
			{    
                if(ch[i]==(ch[j]) && ch[i]!=' ' && ch[i]!='0')
				{    
                    count[i]++;  
                    //ch[j]='0';//to avoid printing already visited character 
                }     
            }
        } 
        //counting the occurence of character
        for(int i=0;i<count.length;i++) 
        {
            if(minCount > count[i] && count[i]!='0')
			{    
                minCount = count[i];    
                minChar = ch[i];    
            }
            if(maxCount < count[i])
			{    
                maxCount = count[i];    
                maxChar = ch[i];    
            }  
        }  
        System.out.println("Minimum occured character in the string is: " + minChar);    
        System.out.println("Maximum occured character in the string is: " + maxChar);
       
        sc.close();
        
    }
    
}

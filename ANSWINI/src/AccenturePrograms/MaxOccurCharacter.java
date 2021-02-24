package AccenturePrograms;

import java.util.Scanner;
//program to find maximum occured character in a string
public class MaxOccurCharacter 
{
    public static void main(String[] args) 
    {
        //user input
        Scanner sc=new Scanner(System.in);
        //validation of string
        String st;
        do
        {
            System.out.println("Enter your String");
            while(!sc.hasNext("[A-Za-z]*"))
            {
                System.out.println("Please enter valid string with only alphabets");
                sc.next();
            }
            st=sc.nextLine();
        }while(st.equals(""));
        System.out.println("It is a valid string"+st);

        st=st.toLowerCase();
        char maxChar=st.charAt(0) ;
        
        //converts given string 'st' into character array 'ch'
        char ch[]=st.toCharArray(); 
         
        //array to count occurence of element
        int count[]=new int[st.length()];
        int  maxCount=0;

        for(int i = 0; i < ch.length; i++)
		{    
            count[i] = 1;   
            for(int j = i+1; j < ch.length; j++)
			{    
                if(ch[i]==(ch[j]) && ch[i]!=' ' && ch[i]!='0')
				{    
                    count[i]++;  
                    ch[j]='0';//to avoid printing already visited character 
                }     
            }
        } 
        //counting the occurence of character
        for(int i=0;i<count.length;i++) 
        {
            
            if(maxCount < count[i])
			{    
                maxCount = count[i];    
                maxChar = ch[i];    
            }  
        }     
        System.out.println("Maximum occured character in the string is: " + maxChar);
       
        sc.close();
        
    }
    
}

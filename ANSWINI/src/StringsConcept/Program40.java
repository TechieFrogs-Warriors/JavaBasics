package StringsConcept;

import java.util.Scanner;

public class Program40 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();
        str=str.toLowerCase(); 
        sc.close(); 
        int[] freq = new int[str.length()];    
          
        char s[] = str.toCharArray();  
          
        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(s[i] == s[j]) 
                {  
                    freq[i]++;    
                    s[j] = '0';  
                }  
            }  
        }  
        System.out.println("Characters and their corresponding frequencies");  
        for(int i = 0; i <freq.length; i++) 
        {  
            if(s[i] != ' ' && s[i] != '0')  
            System.out.print(s[i] + "-" + freq[i]+" ");  
        }  
    }
}
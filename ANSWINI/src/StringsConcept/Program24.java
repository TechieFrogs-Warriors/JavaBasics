package StringsConcept;

import java.util.Scanner;

public class Program24 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string with punctuation marks");
        String s=sc.nextLine();
        sc.close();
       char ch[]=s.toCharArray();
       int count=0;
       for(int i=0;i<s.length();i++)
       {
            
            if(ch[i]=='!'||ch[i]=='.'||ch[i]==','||ch[i]=='?'||ch[i]=='"'||ch[i]=='\''||ch[i]==';'||ch[i]==':')
            {
               count++;
            }
            
        }
        System.out.println("total punctuation marks in the string are: "+count);
    } 
}

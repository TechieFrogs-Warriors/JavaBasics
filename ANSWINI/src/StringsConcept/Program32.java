package StringsConcept;

import java.util.Scanner;

public class Program32 
{
    static void convertOpposite(StringBuffer str) 
    { 
        for (int i=0; i<str.length(); i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c))
            {
                str.replace(i, i+1, Character.toUpperCase(c)+"");//start,end,withwhat
            } 
            else
            {
                str.replace(i, i+1, Character.toLowerCase(c)+"");
            }
        } 
        System.out.println(str); 
    } 
       
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING WITH SPACES");
        StringBuffer str = new StringBuffer(sc.nextLine()); 
        sc.close();
        convertOpposite(str); 
           
    } 
    
}

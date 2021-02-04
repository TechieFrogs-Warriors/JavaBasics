package StringsConcept;

import java.util.*;

public class Program11 
{
    public static void main(String[] args) 
    {
        String cAlphabets="ABCDEFGHIJKLMNOPQRSRUVWXYZ";
        String lAlphabets="abcdefghijklmnopqrstuvwxyz";
        String num="1234567890";
        String alphaNumeric=cAlphabets+lAlphabets+num;

        StringBuilder s1=new StringBuilder();
        Random obj=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what length of random string you want:");
        int length=sc.nextInt();
        
        for(int i=0;i<length;i++)
        {
            int index=obj.nextInt(alphaNumeric.length());//passing length of concatenated string
            char ch=alphaNumeric.charAt(index);//passing character at that index to ch.
            s1.append(ch);//appending to stringbuilder object

        }
        System.out.println("Random value is: "+s1);
        sc.close();
        
    }
    
}

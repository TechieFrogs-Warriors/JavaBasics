package AccenturePrograms;

import java.util.Scanner;
import java.util.StringTokenizer;
//program to find all palindrome words from a string
public class AllPalinWords_InString 
{
    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc=new Scanner(System.in);
        //validating user input for string
        String s;
        do
        {
            System.out.println("Enter your String");
            while(!sc.hasNext("[A-Za-z]*"))
            {
                System.out.println("Please enter valid string with only alphabets");
                sc.next();
            }
            s=sc.nextLine();
        }while(s.equals(""));
        System.out.println("It is a valid string"+s);

       s=s.toLowerCase();//converting total string to lowercase
        int count=0;//to count palinndrome words

        //To break the string into words or tokens based on space
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            String word=st.nextToken();
            if(palindrome(word))
            {
                System.out.println(word+" ");
                count++;
            }
        }
        System.out.println("Number of palindrome words are: "+count);
        sc.close();
        
    }
    //checking word is palindrome or not
    public static boolean palindrome(String w)
    {
        String rev="";
        for(int i=w.length()-1;i>=0;i--)
        {
            rev=rev+w.charAt(i);
        }
        if(rev.equals(w))
        return true;
        else
        return false;
    } 
    
}

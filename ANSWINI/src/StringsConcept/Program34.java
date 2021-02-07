package StringsConcept;

import java.util.Scanner;

public class Program34 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        sc.close();
        System.out.println("original string is:  "+str);
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        String s=str1.toString();
        System.out.println("After reverse string is:  "+s);
        if (str.equals(s))
        {
            System.out.println("String is palindrome");
        }
        else
        System.out.println("String is not palindrome");
        
    }
    
}

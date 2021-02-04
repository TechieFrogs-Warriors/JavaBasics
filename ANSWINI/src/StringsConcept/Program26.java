package StringsConcept;

import java.util.Arrays;
import java.util.Scanner;

public class Program26 
{
    //program to find two strings are anagram
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=sc.nextLine();
        System.out.println("Enter second string");
        String s2=sc.nextLine();
        sc.close();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
        {
            System.out.println("strings are not Anagram");
        }
        else
        {
            char ch[]=s1.toCharArray();
            char ch1[]=s2.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if(Arrays.equals(ch, ch1)==true)
            {
                System.out.println("strings are Anagram");
            }
            else
            {
                System.out.println("strings are not Anagram");
            }

        }

    }
    
}

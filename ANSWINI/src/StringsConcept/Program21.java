package StringsConcept;

import java.util.Scanner;

public class Program21 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first string:");
        String s1=sc.nextLine();
        System.out.println("Enter your second string:");
        String s2=sc.nextLine();
        System.out.println("Enter the shuffled string:");
        String s3=sc.nextLine();
        sc.close();
        System.out.println("The strings are \"" + s1 + " & \"" + s2);
        System.out.println("The shuffled string is: "+s3);
        System.out.println("Is the given string is shuffle of two strings: " + checkShuffle(s1, s2, s3));
    }
    private static boolean checkShuffle(String str1, String str2, String shuffledString) 
    {
        int i = 0, j = 0, k = 0;
        if (str1.length() + str2.length() != shuffledString.length()) 
        {
            return false;
        }
        while (k < shuffledString.length()) 
        {
            if (i < str1.length() && str1.charAt(i) == shuffledString.charAt(k)) 
            {
                i++;
            } 
            else if (j < str2.length() && str2.charAt(j) == shuffledString.charAt(k)) 
            {
                j++;
            } 
            else 
            {
                return false;
            }
            k++;
        }
        if (!(i == str1.length() && j == str2.length() && k == shuffledString.length())) 
        {
            return false;
        }
        return true;
    }
    
}

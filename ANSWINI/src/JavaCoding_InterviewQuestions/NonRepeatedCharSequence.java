package JavaCoding_InterviewQuestions;

import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program or function to find the longest substring without repeating characters in a given string
public class NonRepeatedCharSequence 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //taking string as a input
        String str = Validation.stringValidation(sc);
        boolean flag;

        //to store the substrings
        String[] sub_String = new String[2*str.length()];

        //logic to get substrings from string
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                sub_String[i]=str.substring(i, j+1);
            }
        }
        //to avoid null pointer exception
        try
        {
            for(int i=0;i<sub_String.length;i++)
            {
                flag = is_Repeat(sub_String[i]);//check each substring
                if(flag)
                {
                    System.out.print(sub_String[i]+" ");
                    break;
                }
            }
        }catch(NullPointerException e)
        {
            System.out.println(" ");
        }
        sc.close();
    }

    //method to find repeting words in  each substring
    public static boolean is_Repeat(String str)
    {
        int count = 0;
        char ch[] = str.toCharArray();//string to char array

        //checks for duplicate characters
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j]) //checks if same elements are there in the string
                {
                    count++;
                }
            }
        }
        if(count > 0) //duplicate characters present
        {
            return false;
        }
        //duplicate characters not present
        else
        {
            return true;
        }
    }
    
}

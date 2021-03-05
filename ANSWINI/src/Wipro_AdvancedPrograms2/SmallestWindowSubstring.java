package Wipro_AdvancedPrograms2;

import java.util.Scanner;

public class SmallestWindowSubstring 
{
    public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc = new Scanner(System.in);
        //Taking first string 
        System.out.println("Enter first string");
        String firstText = sc.nextLine();
        //Taking second string, basing on which smallest window substring from the first string is achieved
        System.out.println("Enter second string");
        String secondText =sc.nextLine();

        //calling the method that performs logic to find smallst window substring
        System.out.println("smallest window substring : "+smallestWindow(firstText,secondText));
        
        sc.close();
        
    }
    //Method that performs logic
    public static String smallestWindow(String s,String p) 
    {
        if(s==null || p==null)
        {
            return "";
        }
        String result = "";
        //Array to count characters
        int[] letterCount = new int[128]; //128 asciivalues
        int left = 0; //beginning of the window
        int right = 0; //end of the window
        int count=0,minLen=Integer.MAX_VALUE;

        //converting string 'p' into character array and incrementing its character count
        for(char c : p.toCharArray())
        {
            ++letterCount[c];
        }
        //checking for matching of characters
        for(right=0;right<s.length();right++)
        {
            if( (--letterCount[s.charAt(right)]) >= 0 )
            {
                count++;//increment when characters of 'p' string are found
            }
        
            //to check if whether it is minimum window or not
            while(count == p.length())
            {
                if(minLen > right-left+1)
                {
                    minLen = right-left+1;
                    result = s.substring(left, right+1);
                }
                //to reduce the size of the window
                if( (++letterCount[s.charAt(left)] ) > 0)
                {
                    count--;
                }
                left++;
            }
        }
       return result;
    }
    
}

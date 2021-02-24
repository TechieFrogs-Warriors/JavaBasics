package WiproPrograms;

import java.util.Scanner;

//program to count the special characters in a string
public class SpecialCharacters_InString 
{
    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();
        str=str.toLowerCase();
        //System.out.println(str.length());
        char chArr[]=str.toCharArray();
        int count=0;
        //Loop to count special characters
        for(int i=0;i<chArr.length;i++)
        {
            if(!(chArr[i]>='a'&& chArr[i]<='z' || chArr[i]>='0' && chArr[i]<='9'))
            {
                count++;
            }
        }
        System.out.println("Number of special characters in tha string are : "+count);
        sc.close();
        
    }
    
}

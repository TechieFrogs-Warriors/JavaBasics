package WiproAdvancedPrograms;

import java.util.Scanner;

public class SmallestSubstring 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String S=inputValidation(scanner);
        String P=inputValidation(scanner);
        String smallest=smallestWindow(S,P);
        System.out.println("the smallest substring that contain given string is "+smallest);
    }
    public static String smallestWindow(String S,String P)
    {
        if(S==null||P==null)//checks if the Strings are null 
        {
            return "";//if null returns null

        }
        String result="";
        int letterCount[]=new int [128];
        int left=0,right=0,count=0,minLen=Integer.MAX_VALUE;
        
        for(char c:P.toCharArray())//converts the second string to charArray
        {
            ++letterCount[c];//stores the characters in lettercount array
        }
        for(right=0;right<S.length();right++)
        {
            if((--letterCount[S.charAt(right)])>=0)//chesks the count of charcaters in the string
            {
                count++;
            }
            while(count==P.length())
            {
                if(minLen>right-left+1)
                {
                    minLen=right-left+1;
                    result=S.substring(left, right+1);//gives the sub string from left value to right value
                }
                if((++letterCount[S.charAt(left)])>0)//decreses the size of substring
                {
                    count--;
                }
                left++;
            }
        }
        return result;
     }
    public static String inputValidation(Scanner scanner)
    {
        String sentence;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered String is not valid .Please enter valid STring");
                scanner.hasNext();
            }
            sentence=scanner.nextLine();
        }while(sentence.equals(" "));
        return sentence;
    }
    
}

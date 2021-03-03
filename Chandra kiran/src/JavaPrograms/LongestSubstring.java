package JavaPrograms;

import java.util.Scanner;

public class LongestSubstring 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String Longest=inputValidation(scanner);
        boolean flag;
        String subStringArray[]=new String[2*Longest.length()];
        for(int i=0;i<Longest.length();i++)
        {
            for(int j=i+1;j<Longest.length();j++)
            {
                subStringArray[i]=Longest.substring(i, j+1);//generates all possible substrings into array
            }
        }
        for(int i=0;i<Longest.length();i++)
        {
            flag=duplicateCharacters(subStringArray[i]);//method calling
            if(flag)//checks if flag is true 
            {
                System.out.print(subStringArray[i]+" ");//prints the longest substring without repeating characters
                break;
            }

        }
        
        
    }
    public static boolean duplicateCharacters(String Longest)
    {
        int count=0;
        char characterArray[]=Longest.toCharArray();
        for(int i=0;i<Longest.length();i++)//for loop for first element
        {
            for(int j=i+1;j<Longest.length();j++)//for loop for next element
            {
                if(characterArray[i]==characterArray[j])///checks if there are equal characters
                {
                    count++;//if there count will be increamented
                }
            }
        }
            if(count>0)//checks the count value
            {
                return false;//if greater than zero return false
    
            }
            else
            {
                return true;//else return true
    
            }
    
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

package JavaPrograms;

import java.util.Scanner;

public class PercentageinString 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int upperCasecount=0,lowerCaseCount=0,digitsCount=0,specialCharactersCount=0;
        String combination=inputValidation(scanner);
        for(int i=0;i<combination.length();i++)
        {
            char ch = combination.charAt(i);
             if(ch>='A'&&ch<='Z')//checks uppercase letters
            {
                upperCasecount++;
            }
            else if(ch>='a'&&ch<='z')//checks lower case letters
            {
                lowerCaseCount++;
            }
            else if(ch>='0'&& ch<='9')// checks the digits
            {
                digitsCount++;
            }
            else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch==' ')//checks specialcharacters
            {
               specialCharactersCount++;
            }
        }
            System.out.println("Percentage of Uppercase Letters "+(upperCasecount*100)/combination.length());//percentage of uppercase letters
            System.out.println("Percentage of Lowercase Letters "+(lowerCaseCount*100)/combination.length());//percentage of lower case letters
            System.out.println("Percentage of Digits "+(digitsCount*100)/combination.length());//percentage of digits
            System.out.println("Percentage of Special characters "+(specialCharactersCount*100)/combination.length());//percentage of special characters
           
        
        
    }
    public static String inputValidation(Scanner scanner)
    {
        String sentence;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[A-Za-z0-9!@#$%^&*()_+?]*"))
            {
                System.out.println("Entered String is not valid .Please enter valid STring");
                scanner.hasNext();
            }
            sentence=scanner.nextLine();
        }while(sentence.equals(" "));
        return sentence;
    }
    

    
}

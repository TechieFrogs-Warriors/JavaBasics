package JavaCoding_InterviewQuestions;

import java.text.DecimalFormat;
import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program to find the percentage of 
//uppercase letters, lowercase letters, digits and other special characters(including space) 
//in the given string.
public class CharacterPercentage 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);
        //Taking string as input
        String text = Validation.stringValidation(sc);
        
        int upperCaseLetters = 0,lowerCaseLetters = 0,digits = 0,others = 0,totalChars = text.length();
         
        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
             
            //If ch is in uppercase, then incrementing upperCaseLetters
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }
            //If ch is in lowercase, then incrementing lowerCaseLetters
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            //If ch is a digit, then incrementing digits
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            //If ch is a special character then incrementing others
            else
            {
                others++;
            }
        }
        //Calculating percentage of uppercase letters, lowercase letters, digits and other characters
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
        double digitsPercentage = (digits * 100.0) / totalChars;
        double otherCharPercentage = (others * 100.0) / totalChars;

        //to format output to two decimal position
        DecimalFormat formatter = new DecimalFormat("##.##");
        
        //printing all percentages
        System.out.println("uppercase percentage is: "+formatter.format(upperCaseLetterPercentage)+" %");
        System.out.println("Lowerercase percentage is: "+formatter.format(lowerCaseLetterPercentage)+" %");
        System.out.println("Digits percentage is: "+formatter.format(digitsPercentage)+" %");
        System.out.println("Other characters percentage is: "+formatter.format(otherCharPercentage)+" %");

        sc.close();
        

    }
    
}

package JavaCoding_InterviewQuestions;

import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program to reverse a string with preserving the position of spaces
public class ReverseString_Preserving_Spaces 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);
        //Taking string as input
        String text = Validation.stringValidation(sc);
        
        //calling method for pring string in reverse preserving space
        reverseString_PreservingSpace(text);
                    
    }
    public static void reverseString_PreservingSpace(String text)
    {
        //Removing spaces from the string text and placing the result in another string variable
        String resultText = text.replaceAll(" ", "");
        //assigning last character postion to position variable
        int position = resultText.length()-1;

        //Loop to run through the string and print output
        for (int i=0;i<text.length();i++) 
        {
            if (text.charAt(i) == ' ') //if there is space 
            {
                System.out.print(" "); //print space

            } 
            //if no space then print character present inlast position
            else 
            {
                System.out.print(resultText.charAt(position)); 
                position--; //decrement position until all characters are printed
            }

        }
    }
    
}

package JavaCoding_InterviewQuestions;

import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program to take input number from the user, reverse it and add it to itself. 
//If the sum is not a palindrome then repeat the procedure until you get a palindrome
public class ReverseAddNumber_UntilPalindrome 
{
    //Method for reversing a number
    public static long reverse(long number ) 
    {
        long rev = 0 ;
        long rem = 0 ;
        while(number != 0 ) 
        {
            rem = number % 10;
            rev = (rev * 10 + rem);
            number = number / 10 ;
        }
        return rev; //returns reversed number
    }
        
    //boolean method to check if number is palindrome.
    public static boolean isPalindrome(long number) 
    {
        long reverse = reverse(number);
        return (reverse == number); //returns true or false depending on number is palin or not
        
    }
        
    public static void main(String[] args) 
    {
        //Reading user input number and validating it
        Scanner sc = new Scanner(System.in);
        //take number of long datatype because we dont know how big result could be
        long number = Validation.integerValidation(sc);
        //Logic
        while(true) 
        {
            if(isPalindrome(number)) //check if number is palindrome
            {
                System.out.println(number); //if true print the number
                break;
            }
            //if number is not palindrome...reverse it and add to previous number
            else 
            {
                number = number + reverse(number); 
            }
        }
        sc.close();
    }
}

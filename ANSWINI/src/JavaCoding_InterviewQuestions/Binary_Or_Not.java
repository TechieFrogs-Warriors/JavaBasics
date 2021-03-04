package JavaCoding_InterviewQuestions;

import java.util.Scanner;

//Write a java program to check whether given number is binary or not.
public class Binary_Or_Not 
{
    //validation method
    public static int integerValidation(Scanner sc) 
    {
        int number;
        do
        {
            System.out.println("Please enter your positive integer number");
            while(!sc.hasNextInt())
            {
                System.out.println("Its invalid.please enter again");
                sc.next();
            }
            number = sc.nextInt();
        }while(number < 0);
        
        return number;
        
    }
    public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc = new Scanner(System.in);

        //validating input number
        int number = integerValidation(sc);

        //calling method that performs logic to find if number is binary or not.
        System.out.println(isBinary(number));
        sc.close();
        
    }
    public static boolean isBinary(int num) 
    {
        int temp = num; //placing the input number into temporary variable to use in further logic
        boolean binary = true ;
        //Logic to check each digit of the input number

        while(num != 0)
        {
            temp = num % 10; //extracting remainder(last digit) of given number
            if(temp > 1) //binary contains '0's and '1's only.
            {
                binary = false ; //making false if more than 1 then it is not binary 
                break; //break loop even if onedidit of the total number is greater than 1
            }
            else
            {
                num = num / 10; //if less than 1,continue checking the other digits of the number
            }
            
        }
        return binary;
        
    }
}

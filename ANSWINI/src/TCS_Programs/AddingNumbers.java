package TCS_Programs;

import java.util.Scanner;

//Program Using a method, pass two variables and find the sum of two numbers
public class AddingNumbers 
{
    public static void main (String args[])
    {
        //Reading input from user 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        //reading first integer number and validating it
        int firstNumber = Validation.integerValidation(sc);
        System.out.println("Enter the second number ");
        //reading second float number and validating it
        float secondNumber = Validation.floatValidation(sc);
        
        //calling adding method
        addNumbers(firstNumber, secondNumber);
        
        sc.close();
    }

    //method that adds two numbers
    public static void addNumbers(int num1, float secondNumber)
    {
        float addedSum = num1 + secondNumber;
        System.out.println("The sum of two numbers is "+addedSum);
    }
    
}

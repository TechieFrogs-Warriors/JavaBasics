package TCS_Programs;

import java.util.Scanner;

//Program to find a number is prime or not
public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc = new Scanner(System.in);
        int inputNum = Validation.integerValidation(sc);
        boolean isPrime = false;//flag variable
        //calling prime method and catching its result flag value in flag variable
        isPrime = prime(inputNum);
        //printing output as per flag variable value
        if(isPrime)
        System.out.println("Number is a prime number");
        else
        System.out.println("Number is not a prime number");
        
        
    }

    //Method that performs logic to check number is  prime or not
    public static boolean prime(int number) 
    {  
        //checking if number is 0 or 1 because 0,1 are not all prime numbers
        if(number <=1)
        {
            System.out.println("number is not prime ");
        }
        //checking the given number is prime or not 
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            
            }  
        }
        return true;   
          
    }  
}

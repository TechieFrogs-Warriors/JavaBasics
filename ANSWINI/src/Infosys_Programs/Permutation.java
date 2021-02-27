package Infosys_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class Permutation 
{
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            //System.out.println("Enter string ");
            while(!sc.hasNext("[0-9]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }

    //method for converting any number system to decimal system
    public static int decimalConversion(int n,int len,int y) 
    {
        int temp = 0; 
        int result = 0;
        //loop to conversion to decimal system
        for(int i=0;i<len;i++)
        {
            temp = n % 10;
            result = result + (temp * (int)Math.pow(y, i));
            n = n/10 ;
        }
        //Returning number in decimal format
        return result;
        
    }

    //Logic method to check if decimal number is divisible by 'k' ,if so return permutation(quotient)
    public static int  divisible_K(int y,int k,String x) 
    {

        int len = x.length(); //length of string
        
        //converting string to integer
        int aliceNumber = Integer.parseInt(x);

        //calling decimal conversion method to get number in decimal format 
        int output = decimalConversion(aliceNumber, len, y);

        //checking if decimal number recieved is divisible by 'k' value given by user
        if(output % k == 0)
        {
            return output/k ; //if true return permutation(quotient)
        }

        //If  not divisible by 'k' 
        else
        {
            //reversing the number
            int remainder=0,rev =0 ;
            while(aliceNumber != 0)
            {
                remainder = aliceNumber % 10 ;
                rev = (rev*10) + remainder ;
                aliceNumber = aliceNumber / 10 ; 
            }
            //again calling decimal conversion method
            output = decimalConversion(rev, len, y);

            //if divisible return permutation(quotient)
            if(output % k == 0)
            {
                return output/k ;
            }

            //If totally not divisible 
            else
            {
                return 0;
            }
        }
        
    }

    //Driver class
    public static void main(String[] args) 
    {
        //reading user input and validating them
        Scanner sc = new Scanner(System.in);
        
        //reading the number system(base) by user 
        System.out.println("Enter base value");
        int y = Validation.integerValidation(sc);

        //reading the divisor from user
        System.out.println("Enter bob number");
        int k = Validation.integerValidation(sc);

        //reading the number to be divided from user
        System.out.println("Enter Alice string ");
        String x = stringValidation(sc);

        int permutations = divisible_K(y,k,x);
        System.out.println("Number of permutations : "+permutations);

        
    }
    
}

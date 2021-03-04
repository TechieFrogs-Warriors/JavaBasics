package JavaCoding_InterviewQuestions;

import java.util.Scanner;

import TCS_Programs.Validation;

//Write a java program to convert decimal to binary, decimal to octal and decimal to hexadecimal. 
public class Conversions 
{
    public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc = new Scanner(System.in);

        //taking decimal input number to convert to binary
        int number = Validation.integerValidation(sc);

        //calling conversion methods
        decimalToBinary(number);
        decimalToOctal(number);
        decimalToHexadecimal(number);

        
    }
    //conversion methods
    public static void decimalToBinary(int number) 
    {
        int temp = number; //placing input number into temporary variable
        String binaryNum = ""; //to store binary value after conversion from decimal to binary
        int rem = 0; //remainder variable
        while(number != 0)
        {
            rem = number % 2; ////since hexadecimal divide by 2
            binaryNum = rem + binaryNum; //since adding to string ,concatenation happens here
            number = number / 2;

        }
        System.out.println("Binary value of "+temp+" is : "+binaryNum);
        
    }
    public static void decimalToOctal(int number) 
    {
        int temp = number; //placing input number into temporary variable
        String octalNum = ""; //to store octal value after conversion from decimal to octal
        int rem = 0; //remainder variable
        while(number != 0)
        {
            rem = number % 8; //since hexadecimal divide by 8
            octalNum = rem + octalNum; //since adding to string ,concatenation happens here
            number = number / 8;

        }
        System.out.println("Octal value of "+temp+" is : "+octalNum);
    }
    public static void decimalToHexadecimal(int number) 
    {
        int temp = number; //placing input number into temporary variable
        String hexaDeciNum = ""; //to store hexa decimal value after conversion from decimal to hexadecimal
        int rem = 0; //remainder variable
        while(number != 0)
        {
            rem = number % 16; //since hexadecimal divide by 16
            hexaDeciNum = rem + hexaDeciNum; //since adding to string ,concatenation happens here
            number = number / 16;

        }
        System.out.println("HexaDecimal value of "+temp+" is : "+hexaDeciNum);
    }
    
}

package TCS_Programs;

import java.util.Scanner;

//Program to find a leap year
public class LeapYear 
{
    public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc = new Scanner(System.in);
        int year = Validation.integerValidation(sc);
        //Logic
        //A leap should be perfectly divisible by 4,100,400 for sure to become a leap year
        if(year%4 == 0 && year%100 == 0 && year%400 == 0)
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Its not a leap year");
        }

        sc.close();
        
    }
}

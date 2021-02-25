package Infosys_Programs;

import java.util.Scanner;

//program to count number of pluses required to match LHS WITH RHS in a string
public class MinimumPluses 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);
        String A = stringValidation(sc);

        //calling and catching the value returned by the method
        int pluses = minimum_pluses(A);

        //Displaying output count of pluses 
        System.out.println("Minimum number of Pluses "+pluses);
        
    }

    //Method that performs logic finding plus count
    public static int minimum_pluses(String A)
    {

        String Str[]=A.split("=");//splitting string into words based on '='
       
        String s = Str[0]; //placing first value of string into s
        String s2 = Str[Str.length-1]; //placing last value of string into s2

        int LHS = Integer.parseInt(s); //converting LHS string value to integer value
        int RHS = Integer.parseInt(s2); //converting RHS string value to integer value

        int count=0,rem=0,sum=0; //variables required to perform logic

        //loop that performs logic
        while(LHS>0)
        {
            rem = LHS % 10; //extracting last digit
            sum = sum + rem; //adding to sum means one plus is added here
            count++; //so count increments here
            LHS = LHS / 10; //extract the number other than last digit 
            if(RHS == (sum + LHS)) //compare whether remainder + remaining number on LHS is equal to RHS value
            {
                System.out.println(count); //if equal print count
                break;
                
            } 
                
        }
            
        return count;
        
    }
        
    
    //validation
    public static String stringValidation(Scanner sc)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!sc.hasNext("[0-9=]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                sc.next();
            }
            Str=sc.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    
}

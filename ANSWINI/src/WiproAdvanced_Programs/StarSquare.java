package WiproAdvanced_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class StarSquare 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);
        int s = Validation.integerValidation(sc);
        //calling method that perform logic to print the pattern
        pattern(s);

        sc.close();
        
    }
    //method that implements logic
    public static void pattern(int s) 
    {
        for(int i=1;i<=s;i++) //loop for rows
        {
            for(int j=1;j<=s;j++) //loop for coloumns
            {
                if(i==1 || j==1 || i==s || j==s)  //logic to print pattern
                {
                    System.out.print("* "); //what we want to print if condition is true
                }
                else
                {
                    System.out.print("  "); //what we want to print if condition is false
                }
            }
            System.out.println(); //prints in next line after completing inner loop
        }
    }
    
}

package WiproAdvanced_Programs;

import java.util.Scanner;

public class SubsetSum 
{
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            System.out.println("Enter string with numbers");
            while(!sc.hasNext("[0-9]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }
    public static void main(String[] args) 
    {
        //Reading the user input and validating it
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your string");
        String str = stringValidation(sc);

        //calling the method that finds subset sum and printing the sum as output
        System.out.println(sumOfSubstrings(str));
        
        sc.close();
        
    }
    public static int sumOfSubstrings(String str) 
    {
        //intializing required variables
        int i = 0,j = 0;
        int sum = 0;
        
        //Loop to find the subsets of the string  
        for ( i = 0; i < str.length(); i++)
        {
            for (j = i+1; j <= str.length(); j++)
            {
                sum = sum + Integer.parseInt( str.substring(i, j)); //summing the subsets here
            }
        }    
        return sum; //returning the sum
        
    }

}

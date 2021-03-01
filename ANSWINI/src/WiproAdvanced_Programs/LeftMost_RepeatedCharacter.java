package WiproAdvanced_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class LeftMost_RepeatedCharacter 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        //Take two strings
        String str = Validation.stringValidation(sc);

        //calling duplicate character finding method
        char repeated_Character = repeatedCharacter(str);

        //printing first duplicate character from left side
        System.out.println(repeated_Character);

        sc.close();
        
    }

    //Method to find frist duplicate character from left side
    public static char repeatedCharacter(String str) 
    {
        int i,j;
        //converting to character array
        char inp[] = str.toCharArray();
        
        //Logic
        System.out.println("Leftmost Duplicate Character is: ");
        for (i=0;i<str.length()-1;i++) 
        {
            int count = 0;
            for (j=i+1;j<str.length();j++) 
            {
                if (inp[i] == inp[j]) //if both position values are same then break inner loop
                {
                    count++;
                    break;
                }
            }
            if(count > 0)
            break; //break outer loop also after finding first duplicate character..no need to search again
        }
        return inp[i]; //print the founded duplicate character
        
    }
    
}

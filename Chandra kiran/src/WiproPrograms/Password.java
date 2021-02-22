package WiproPrograms;

import java.util.Scanner;
public class Password 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Str =InputValidation(scan);
        StringBuffer Sb = new StringBuffer(Str);
        if(Str!=null)
        {
            for(int i=0;i<Str.length();i++)
            {
                if(Character.isLowerCase(Str.charAt(i)))//checks if the character is lowercase
                {
                     Sb.setCharAt(i,Character.toUpperCase(Str.charAt(i)));//coverts the lowercase character into uppercase 
                }
                else if(Character.isUpperCase(Str.charAt(i)))//checks the character is uppercase 
                {
                    Sb.setCharAt(i,Character.toLowerCase(Str.charAt(i)));////converts the uppercase to LowerCase

                }
            }
             System.out.println(Sb);//Prints the result String
        }
        else
        {
            System.out.println("string value is null");
        }
    }
    
    public static String InputValidation(Scanner scan)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
    
}

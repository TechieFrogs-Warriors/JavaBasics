package TCS_Programs;

import java.util.Scanner;

public class Validation 
{
    //Integer validation
    public static int integerValidation(Scanner sc)
    {
        int number;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextInt())
            {
                System.out.println("please enter a positive or valid integer");
                sc.next();
            }
            number = sc.nextInt();

        }while(number<0);
        return number;
    }


    //Float validation
    public static float floatValidation(Scanner sc)
    {
        float number;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextFloat())
            {
                System.out.println("please enter a positive or valid integer");
                sc.next();
            }
            number = sc.nextFloat();

        }while(number<=0);
        return number;
    }
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            System.out.println("Enter string with alphabets");
            while(!sc.hasNext("[a-zA-Z]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }


    //Another integer validation
    public static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
}

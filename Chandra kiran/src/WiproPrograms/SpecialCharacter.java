package WiproPrograms;

import java.util.Scanner;

public class SpecialCharacter 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Str=InputValidation(scan);
        int count=0;
        for(int i=0;i<Str.length();i++)
        {
            char ch=Str.charAt(i);
            if(ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='<'||ch=='?'||ch=='!')//checks the ch value equal to all these characters
            {
                count++;
            }

        }
        System.out.println(count);
    }
    public static String InputValidation(Scanner scan)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext("[A-Za-z$#@%^&?]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
    
}

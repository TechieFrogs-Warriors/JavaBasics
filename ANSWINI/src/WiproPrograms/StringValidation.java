package WiproPrograms;

import java.util.Scanner;

public class StringValidation 
{
        
    public  String validation(Scanner sc)
    {
        //Scanner sc=new Scanner(System.in);
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

}

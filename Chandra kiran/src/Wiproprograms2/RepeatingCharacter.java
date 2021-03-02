package Wiproprograms2;

import java.util.Scanner;

public class RepeatingCharacter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String S=InputValidation(scanner);
         repeatingCharacter(S);//method calling
    }
    public static void repeatingCharacter(String S)
    {
        char ch[]=S.toCharArray();
        int i=0,count=0;
        for(int j=i+1;j<ch.length;j++)
        {
            if(ch[0]==ch[j])//checks the first element with all the elements 
            {
                count++;//if equal count will be increamented
            }

        }
            if(count!=0)//checks the count value
            {
                System.out.println((char)ch[0]);//prints the first element
            }
            else
            {
                System.out.println(-1);//if not -1
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

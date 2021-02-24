package TcsPrograms;

import java.util.Scanner;

public class LeepYear 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int Year=InputValidation(scanner);
        if(Year%4==0&&Year%100!=0&&Year%400!=0)//checks the condition it is divisible by 4,100,400
        {
            System.out.println("Then it is  leep year");
        }
        else
        {
            System.out.println("Then it is not a Leep Year ");

        }

        
        
    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
}

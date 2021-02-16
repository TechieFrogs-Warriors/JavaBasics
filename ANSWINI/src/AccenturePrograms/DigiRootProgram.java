package AccenturePrograms;

import java.util.Scanner;

public class DigiRootProgram 
{
    public static void main(String[] args) 
    {
        //Taking user input to find factorial of that number
        Scanner sc=new Scanner(System.in);
        //validation for the number
        int num;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter positive integer value");
                sc.next();
            }
            num=sc.nextInt();
        }while(num<=0);

        //calling method that performs logic
        calDigiRoot(num);

        sc.close();
        
    }
    public static void calDigiRoot(int number)
    {
        //Logic
        int sum=0,remainder;
        while(number > 10)
        {
            sum=0;
            while(number!=0)
            {
                remainder = number % 10;
                number = number / 10;
                sum = sum + remainder;
            }
            if(sum > 10)
            number = sum;
            else
            break;
        
        }
        System.out.println("DigiRoot of is : "+sum);
        
    } 
    
}

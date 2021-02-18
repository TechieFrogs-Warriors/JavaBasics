package AccenturePrograms;
import java.util.Scanner;

public class Factorial 
{
    //program to find factorial
    public static void main(String[] args) 
    {
        //Taking user input to find factorial of that number
        Scanner sc=new Scanner(System.in);
        //validation for the number
        int num;
        do
        {
            System.out.println("What factorial you want ?");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter positive integer value");
                sc.next();
            }
            num=sc.nextInt();
        }while(num<=0);
        System.out.println("so you want factorial of: "+num);
        
        //Logic
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+num+" is: "+fact);
        sc.close();
        
    }
    
}

package Wiproprograms2;

import java.util.Scanner;

public class SquareOfStars 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int s=InputValidation(scanner);
        square(s);//method calling
    }
    public static void square(int s)
    {
        for(int i=1;i<=s;i++)//for loop for rows
        {
            for(int j=1;j<=s;j++)//for loop for columns
            {
                if((i==1||i==s)||(j==1||j==s))//checks if the i and j are equal to 1 and size
                {
                    System.out.print("* ");//prints star
                }
                else
                {
                    System.out.print(" " +" ");//prints two spaces 
                }
            
            }
            System.out.println();
        }
    }
    public static int InputValidation(Scanner scan)
    {
        int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            n=scan.nextInt();
        }while(n<=0);
        return n;
    }
    
    
}

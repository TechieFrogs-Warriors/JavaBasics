package AccenturePrograms;

import java.util.Scanner;
//program to find the Sum of odds and evens in a number
public class AddEvenOddNumbers 
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
        sumOf_Even_odd_Num(num);
        
        sc.close();
        
    }
    public static void sumOf_Even_odd_Num(int number)
    {
        //Logic
        int even_Sum = 0;
        int odd_Sum = 0;
        while (number > 0)
        {
            //doing sum of even numbers
            if ((number % 10) % 2 == 0)
            {
                even_Sum = even_Sum + number % 10;
            }
            //doing sum of odd numbers
            else
            {
                odd_Sum = odd_Sum + number % 10;
            }

            number = number / 10;
        }
        System.out.println("Even numbers sum is : " + even_Sum);
        System.out.println("Odd numbers sum is : " + odd_Sum);
    }
    
}

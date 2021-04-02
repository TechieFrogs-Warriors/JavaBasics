package WiproAdvancedPrograms;

import java.util.Scanner;

public class NumberOfWays 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=InputValidation(scanner);
        int noOfWays=countWays(N);//method calling
        System.out.println("Number of ways to climb the stairs to reach nth stair are: "+noOfWays);
    }
    public static int countWays(int N)
    {
        int ways=fib(N+1);//fibonacii method calling
        return ways;//returns number of ways
    }
    public static int fib(int number)
    {
        if(number<=1)//checks if number is less than or equal to 1
        {
            return number;//if returns number
        }
        return fib(number-1)+fib(number-2);//recursive calling of same fabonacci method
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

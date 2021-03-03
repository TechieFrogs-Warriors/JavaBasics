package Wipro_AdvancedPrograms2;

import java.util.Scanner;

import TCS_Programs.Validation;
//program to Count ways to reach the n'th stair 
public class Stairs 
{
    public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc = new Scanner(System.in);

        // intializing the N
        System.out.println("Enter the number of stairs : ");
        int N = Validation.integerValidation(sc);

        System.out.println("Number of ways to climb the stair case is : " + countWays(N));

    }

    //Logic method
    public static int countWays(int N) 
    {
        return fibnoc(N + 1);
    }

    public static int fibnoc(int n) 
    {
        if (n <= 1)  // as to climb steps 1 and 2 the ways are it self
        {
            return n;
        }
        //recurive formula for finding the nth fibonacci series
        return fibnoc(n - 1) + fibnoc(n - 2);
    }
    
}

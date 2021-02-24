package TCS_Programs;

import java.util.Scanner;

//Program to find nth term of 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, ...
public class Series2 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);
		int n = Validation.integerValidation(sc);

        //Logic
        //Geometric series , using Terenary operator
        //even term is 3power,odd term is 2power
		System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));

        sc.close();
        
    }
    
}

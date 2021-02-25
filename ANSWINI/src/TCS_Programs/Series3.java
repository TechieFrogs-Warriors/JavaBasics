package TCS_Programs;

import java.util.Scanner;

//program to find nth term of the series 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8..
public class Series3 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc = new Scanner(System.in);
		int n = Validation.integerValidation(sc);
        
        //Logic
        //every even term is derived from the previous term using the formula (x/2)
        int x=0,nTerm=0;
        if(n % 2 == 0)
        {
            for(int i = 1 ; i <= (n-2) ; i = i+2)
            {
                x = x + 2;
                nTerm = x / 2;
            }
            System.out.print(nTerm);
        }
        else
        {
            for(int i = 1 ; i < (n-2) ; i = i+2)
            {
                x = x + 2;
                nTerm = x / 2;
            }
            x = x + 2;
            System.out.print(x);
        }  
        sc.close();
    }
    
}

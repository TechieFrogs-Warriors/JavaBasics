package TCS_Programs;

import java.util.Scanner;

//Program to find 15th term of series 0,0,7,6,14,12,21,18, 28...
public class Series 
{
    public static void main(String[] args) 
    {
        //Reading input frm user and validating it
        Scanner sc=new Scanner(System.in);
        int  n = Validation.integerValidation(sc); 

        //Logic 

        if (n % 2 == 0)
        {
            n=((n/2)-1)*6;  // Even term is a increment of 6  
            System.out.println(n);
        }
        else  
        {
            n=((n-1)/2)*7; // Odd term is a increment of 7
            System.out.println(n);
           
        }
        sc.close();
        
    }
    
}

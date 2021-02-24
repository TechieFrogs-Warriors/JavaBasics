package AccenturePrograms;

import java.util.Scanner;
//Program to find factors sum of two numbers and compare them.If true return 1,else return 0
public class SumOfFactors 
{
   //Logic to claculate factors sum
    public static int factors(int n)
    {
        int factorSum=0;
        for (int i=1;i<n;i++) 
        {
            if (n % i == 0) 
            {
              //System.out.print(i + " ");//to print factors
              factorSum = factorSum + i;
            }
        }
        int temp = factorSum;//placing given input number factorsum into temperorary variable
        //Again taking factorsum of the factorsum of the input number
        int factorSum2=0;
        for (int i=1;i<temp;i++) 
        {
            if (temp % i == 0) 
            {
              //System.out.print(i + " ");//to print factors
              factorSum2 = factorSum2 + i;
            }
        }
        System.out.println("Factor sums are : "+factorSum+"  "+factorSum2);
        if(factorSum==factorSum2)
        return 1;
        else 
        return 0;
        
    }
       
    public static void main(String[] args) 
    { 
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt(); 

        //calling methods to perform logic
        System.out.println(factors(num1));
        
        sc.close();
    } 
        
    
    
}

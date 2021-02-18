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
              //System.out.print(i + " ");
              factorSum += i;
            }
        }
        return factorSum;
    }
       
    public static void main(String[] args) 
    { 
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt(); 
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        //calling methods to perform logic
        System.out.println(factors(num1));
        System.out.println(factors(num2));

        //checking whether factor sum is equal or not
        if(factors(num1)==factors(num2)) 
        System.out.println("factors sum is equal: "+"1");
        else 
        System.out.println("factors sum is not equal: "+"0");
        sc.close();
    } 
        
    
    
}

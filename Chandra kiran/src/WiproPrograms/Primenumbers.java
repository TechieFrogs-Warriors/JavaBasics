package WiproPrograms;

import java.util.Scanner;

public class Primenumbers 
{
        
        public static boolean prime(int number) 
        {  
            
            for(int i=2;i<=Math.sqrt(number);i++)
            {
                if(number%i==0)
                {
                    return false;
                
                }  
            }
            return true;   
              
        }  
        
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
            int size = InputValidation(scan);
            int[] number = new int[size];
            int[] nonPrimeNum = new int[number.length];
            boolean isPrime=false;//prime check variable
            int primeCount =0;//prime count
            int j=0;
            System.out.println("Enter Array elements ");
            for (int i = 0; i < size; i++) 
            {
                number[i] = scan.nextInt();
                
            }
            
           
            for(int i=0;i<number.length;i++)
            {
                if(number[i]<=1)//checks the number is 1 or 0
                {
                    nonPrimeNum[j]=number[i];//non prime numbers are assigned
                    j++;
                }
                else
                {
                    isPrime=prime(number[i]);
                    if(isPrime)//checks the number is prime or not
                    {
                        System.out.print(number[i]+" ");//prints the prime number
                        primeCount++;//increase the count 
                    }
                    else
                    {
                        nonPrimeNum[j]=number[i];//non prime numbers are stored
                        j++;
                        
                    }
                }
                
            }
            for(int i=0;i<(size-primeCount);i++)
            {
                System.out.print(" "+nonPrimeNum[i]);//prints the non prime numbers
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

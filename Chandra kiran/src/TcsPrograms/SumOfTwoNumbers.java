package TcsPrograms;

import java.util.Scanner;

public class SumOfTwoNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int Number1=InputValidation(scanner);
        float Number2=FloatInputValidation(scanner);
        sumOfNumbers(Number1,Number2);//method calling
        scanner.close();
    }
    public static void sumOfNumbers(int num1,float num2)
    {
        float sum=0;
        sum=num1+num2;//adds two numbers 
        System.out.println(sum);

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
    public static float FloatInputValidation(Scanner scanner)
    {
        Float num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextFloat();
        }while(num<=0);
        return num;
    }
    
    
    
}

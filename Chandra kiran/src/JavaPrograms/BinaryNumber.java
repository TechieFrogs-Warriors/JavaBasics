package JavaPrograms;

import java.util.Scanner;

public class BinaryNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number=InputValidation(scanner);
        int remainder=0;
        while(number!=0)//number equal to zero
        {
            remainder=number%10;//gives the last digit
            if(remainder==0||remainder==1)//if the digit is equal to 1 or 0
            {
               System.out.println("it is binary");//then it is binary
            }
            else
            {
               System.out.println("not a binary number");
            }
            number=number/10;

        }
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

package JavaPrograms;

import java.util.Scanner;

public class DecimalConversions 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number=InputValidation(scanner);
        System.out.println("Binary number of given number is "+Integer.toBinaryString(number));//converts the number into binary number
        System.out.println("Octal number of given number is "+Integer.toOctalString(number));//converts the number into octal number
        System.out.println("Hexadecimal number of given number is "+Integer.toHexString(number));//converts the number into hexa decimal
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

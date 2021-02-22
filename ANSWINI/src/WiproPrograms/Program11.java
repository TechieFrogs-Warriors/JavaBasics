package WiproPrograms;

import java.util.Scanner;

public class Program11 
{
    public static int number;

    // input validation
    public static int inputValidation(Scanner sc) 
    {
        do 
        {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }

            number = sc.nextInt();

        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        number = inputValidation(sc);

        int rem, rev = 0, temp;

        temp = number;

        while(number > 0) 
        {
            rem = number % 10;// getting the last digit of the number as remainder
            rev = (rev * 10) + rem;//storing the new reversed number in 'rev'
            number /= 10;//  removing last digit of the number
        }
        System.out.println(rev);

        int playerScore = temp - rev;// subrtacting the number and reverse of number
        System.out.println("Player score is :  " + playerScore);

    }
    
}

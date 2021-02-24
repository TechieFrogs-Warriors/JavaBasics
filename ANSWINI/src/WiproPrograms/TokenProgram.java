package WiproPrograms;

import java.util.Scanner;

public class TokenProgram 
{
    public static int number;

    // input validation
    public static int inputValidation(Scanner sc) 
    {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
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
        // replacing odd to even and even to odd by using Parse int and replace
        int rev = 0, n = 0, m = 0, rev1 = 0;
        while (number > 0) 
        {
            n = number % 10;
            rev = (rev * 10) + n;
            if (rev % 2 == 0)// checks the even condition
            {
                rev = rev + 1;// adds one to the number
            } else 
            {
                rev = rev - 1;// decrements one from the number
            }
            number = number / 10;
        }
        while (rev > 0)// reversing again to the original form
        {
            m = rev % 10;
            rev1 = (rev1 * 10) + m;
            rev = rev / 10;

        }
        System.out.println(rev1);
    }
    
}

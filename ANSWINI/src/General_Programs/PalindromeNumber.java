import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        // INPUT NUMBER VALIDATION
        int number;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while(!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            number=obj.nextInt();
        } while(number <= 0);
        System.out.println("YES IT IS YOUR NUMBER : " + number);

        //LOGIC
        int reverse=0,temp=number,remainder;
        while(number>0)
        {
            remainder = number % 10;
            reverse = (reverse*10)+remainder;
            number = number/10;
        }
        if(temp==reverse)
        {
            System.out.println("NUMBER IS PALINDROME");
        }
        else    
        System.out.println("NUMBER IS NOT A PALINDROME");
        obj.close();
        
    }
    
}

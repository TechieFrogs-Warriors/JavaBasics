import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        //FIRST NUMBER VALIDATION
        int a;
        do 
        {
            System.out.println("ENTER FIRST POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            a=obj.nextInt();
        } while (a <= 0);
        System.out.println("YES IT IS YOUR FIRST NUMBER : " + a);

        //SECOND NUMBER VALIDATION
        int b;
        do 
        {
            System.out.println("ENTER SECOND POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            b=obj.nextInt();
        } while (b <= 0);
        System.out.println("YES IT IS YOUR SECOND NUMBER : " + b);
        //LOGIC
        System.out.println("THE QUOTIENT OF TWO GIVEN NUMBERS IS = "+(a/b));
        System.out.println("THE REMAINDER OF TWO GIVEN NUMBERS IS = "+(a%b));
        obj.close();
    } 
}

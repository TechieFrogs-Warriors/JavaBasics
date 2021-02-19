import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String[] args)
    {
        System.out.println("------------ validating input for two integers and adding them ------------");
        Scanner obj=new Scanner(System.in);

        //first number validation
        int first;
        do 
        {
            System.out.println("ENTER FIRST POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            first=obj.nextInt();
        } while (first <= 0);
        System.out.println("YES IT IS YOUR FIRST NUMBER : " + first);

       //second number validation
        int second;
        do 
        {
            System.out.println("ENTER SECOND POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            second=obj.nextInt();
        } while (second <= 0);
        System.out.println("YES IT IS YOUR SECOND NUMBER : " + second);
        
        //LOGIC
        System.out.println("SUM OF TWO NUMBERS IS: "+(first+second));
        obj.close();

    }
}

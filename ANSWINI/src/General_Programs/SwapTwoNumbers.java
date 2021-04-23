import java.util.Scanner;

public class SwapTwoNumbers 
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
        }while (b <= 0);
        System.out.println("YES IT IS YOUR SECOND NUMBER : " + b);

        //LOGIC
        int t;
        System.out.println("PLACING 'a' VALUE INTO TEMPERORY VARIABLE 't': "+(t=a));
        System.out.println("PLACING 'b' VALUE INTO FIRST VARIABLE 'a': "+(a=b));
        System.out.println("PLACING TEMPORARY VALUE FROM 't' INTO 'b': "+(b=t));
        System.out.println("AFTER SWAPPING NUMBERS ARE: "+a+" "+b);
        obj.close();

    }
    
}

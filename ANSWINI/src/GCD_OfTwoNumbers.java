import java.util.Scanner;

public class GCD_OfTwoNumbers
{
    public static void main(String[] args) 
    {
        int gcd=1;
        Scanner obj=new Scanner(System.in);

        //FIRST NUMBER VALIDATION
        int firstNum;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            firstNum=obj.nextInt();
        } while (firstNum <= 0);
        System.out.println("YES IT IS YOUR FIRST NUMBER : " + firstNum);
 
        //SECOND NUMBER VALIDATION
        int secondNum;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            secondNum=obj.nextInt();
        }while (secondNum <= 0);
        System.out.println("YES IT IS YOUR SECOND NUMBER : " + secondNum);

        //LOGIC
        for(int i=1;i<=firstNum && i<=secondNum;i++)
        {
            if(firstNum%i==0 && secondNum%i==0)
            gcd=i;

        }
        System.out.println("GCD OF "+firstNum+" AND "+secondNum+" IS = "+gcd);
        obj.close();
         
    }
}

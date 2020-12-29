
import java.util.Scanner;

public class FactorialOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        //INPUT NUMBER VALIDATION
        int number;
        do 
        {
            System.out.println("ENTER POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            number=obj.nextInt();
        } while (number<=0);
        System.out.println("YES IT IS YOUR NUMBER : " + number);

        //LOGIC
        int fact=1;
        int i=1;//needed for only while loop procedure
       /* 
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("FACTORIAL OF  "+number+"  IS = "+fact);
        */
        while(i<=number)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("FACTORIAL OF  "+number+"  IS = "+fact);
        obj.close(); 
    }

}

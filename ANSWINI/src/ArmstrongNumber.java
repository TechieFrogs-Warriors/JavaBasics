import java.util.Scanner;

public class ArmstrongNumber
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
        System.out.println("YES IT IS YOUR  NUMBER : " + number);

        //LOGIC
        int sum=0,temp=number,remainder;
        while(number>0)
        {
            remainder = number % 10;
            sum = sum+(remainder*remainder*remainder);
            number = number/10;
        }
        if(temp==sum)
        {
            System.out.println("IT IS ARMSTRONG NUMBER");
        }
        else    
        System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
        obj.close();
    }
}

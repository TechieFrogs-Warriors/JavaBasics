import java.util.Scanner;

public class EvenOrOddNumber 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        //FIRST NUMBER VALIDATION
        int a;
        do 
        {
            System.out.println("ENTER POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            a=obj.nextInt();
        } while (a <= 0);
        System.out.println("YES IT IS YOUR NUMBER : " + a);
        
        //LOGIC
        if(a%2==0)
        {
            System.out.println("IT IS EVEN NUMBER");
        }else
        {
            System.out.println("IT IS ODD NUMBER");
        }
        obj.close();
    }
    
}

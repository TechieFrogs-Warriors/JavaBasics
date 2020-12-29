import java.util.Scanner;

public class LargestInTheGivenNumbers
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

        //THIRD NUMBER VALIDATION
        int c;
        do 
        {
            System.out.println("ENTER THIRD POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            c=obj.nextInt();
        }while (c <= 0);
        System.out.println("YES IT IS YOUR THIRD NUMBER : " + c);

        //LOGIC
        if(a>b && a>c)
        {
            System.out.println("LARGEST AMONG THREE NUMBERS IS: "+a);

        }else if(b>a && b>c)
        {
            System.out.println("LARGEST AMONG THREE NUMBERS IS: "+b);
        }else
        {
            System.out.println("LARGEST AMONG THREE NUMBERS IS: "+c);
        }
        obj.close();   
    }
    
}

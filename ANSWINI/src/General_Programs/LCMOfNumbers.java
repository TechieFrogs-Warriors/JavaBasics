import java.util.Scanner;

public class LCMOfNumbers
{
    public static void main(String[] args)
    {
        int maxNum,temp,lcm=0;
        Scanner obj=new Scanner(System.in);
        //FIRST NUMBER VALIDATION
        int n1;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n1=obj.nextInt();
        } while (n1 <= 0);
        System.out.println("YES IT IS YOUR FIRST NUMBER : " + n1);
 
        //SECOND NUMBER VALIDATION
        int n2;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n2=obj.nextInt();
        }while (n2 <= 0);
        System.out.println("YES IT IS YOUR SECOND NUMBER : " + n2);

        //LOGIC
        if(n1>n2)
        {
            maxNum=temp=n1;
        }else
        {
            maxNum=temp=n2;
        }
        while(n1!=0)
        {
           if(maxNum%n1==0 &&maxNum%n2==0)
           {
               lcm=maxNum;
               break;
           }
           maxNum=maxNum+temp;
        }
        System.out.println("LCM OF "+n1+" AND "+n2+" IS = "+lcm);
        obj.close();
         
    }
    
}

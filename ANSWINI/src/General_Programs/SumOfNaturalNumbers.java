import java.util.Scanner;

public class SumOfNaturalNumbers
 {
     public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        //INPUT NUMBER VALIDATION
        int n;
        do 
        {
            System.out.println("ENTER POSITIVE NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n=obj.nextInt();
        } while (n<=0);
        System.out.println("YES IT IS YOUR NUMBER : " + n);

        //LOGIC
        int sum=0,i=1;
        System.out.println("*******USING FOR LOOP*******");
        for(;i<=n;i++)//using for loop
        {
            sum=sum+i;
        }
        System.out.println("SUM OF FIRST "+n+" NATURAL NUMBERS IS = "+sum+"\n");

        System.out.println("*******USING WHILE LOOP*******");
        while(i<=n)//using while loop
        {
            sum=sum+i;
            i++;
        }
        System.out.println("SUM OF FIRST "+n+" NATURAL NUMBERS IS = "+sum);
        obj.close();   
    }
    
}

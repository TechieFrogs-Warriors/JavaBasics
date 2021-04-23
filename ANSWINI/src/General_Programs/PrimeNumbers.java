import java.util.Scanner;

public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        
        Scanner obj=new Scanner(System.in);
        // INPUT NUMBER VALIDATION
        int n;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n=obj.nextInt();
        } while (n <= 0);
        System.out.println("YES IT IS POSITIVE NUMBER : " + n);

        //LOGIC
        boolean prime=true;
        if(n==0||n==1)
        {
            System.out.println(n+" IS NOT PRIME AT ALL");
        }else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" IS NOT A PRIME NUMBER");
                    prime=false;
                    break;
                }  
            }
            if(prime==true)
            {
                System.out.println(n+" IS A PRIME NUMBER");
                obj.close();
            }
            
        }
        
    }
    
}

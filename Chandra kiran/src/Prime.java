import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner P= new Scanner(System.in);
       // input validation..
        int n;
        do{
            System.out.println("enter positive number");
            while(!P.hasNextInt())
            {
                String input = P.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=P.nextInt();
          
        }while(n<0);
        int i,m,flag=0;
        m=n/2;//m is half value of the number
        if(n==0||n==1)
        {
          System.out.println("n is not a prime number");

        }
        for(i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("n is not a prime number");//condition for checking the prime number
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("n is a prime number");
        }
        
        P.close();
    }
    
}

import java.util.Scanner;
public class NaturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner N= new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!N.hasNextInt())
            {
                String input = N.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=N.nextInt();
        }while(n<0);
        int i,sum=0;
        for(i=1;i<n;i++)
        {
           sum=sum+i;//sum of the numbers is stored in the sum again
           System.out.println(sum);
        N.close();
        }
        
    }
    
}

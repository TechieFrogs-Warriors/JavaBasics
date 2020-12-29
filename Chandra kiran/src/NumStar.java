import java.util.Scanner;
public class NumStar 
{
    public static void main(String[] args) {
        Scanner N= new Scanner(System.in);
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
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=5;j>=1;j--)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print(j);
                }

            }
            System.out.println();

         }
        
       N.close();
    }
    
}

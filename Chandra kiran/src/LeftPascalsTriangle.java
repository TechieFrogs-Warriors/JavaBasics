import java.util.Scanner;
public class LeftPascalsTriangle 
{
    public static void main(String[] args) 
    {
        Scanner D= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!D.hasNextInt())
            {
                String input = D.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=D.nextInt();


        }while(n<0);

        int i,j,k;
         for(i=1;i<=n;i++)//outer for loop
         {
             for(j=i;j<n;j++)// inner for loop
             {
                 System.out.print(" ");//prints the space
             }
             for(k=1;k<=i;k++)
             {
                 System.out.print("*");//prints star
             }
              System.out.println("");
         }
        for(i=n;i>=1;i--)//outer for loop
         {
               for(j=i;j<=n;j++)//inner for loop
             {
                 System.out.print(" ");// prints the space
             }
                for(k=1;k<i;k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
           }
         D.close();
    
    }
    
}

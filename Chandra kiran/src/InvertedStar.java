import java.util.Scanner;
public class InvertedStar 
{
    public static void main(String[] args) 
    {
        Scanner I= new Scanner(System.in);
        //input validation
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!I.hasNextInt())
            {
                String input = I.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=I.nextInt();
        }while(n<0);
         int i,j;
         for(i=5;i>=1;i--)//outer for loop
           {
               for(j=1;j<=i;j++)// inner for loop
               {
                  System.out.print("* ");//prints star
               }
               System.out.println();
           }
         I.close();
    }
    
}

    

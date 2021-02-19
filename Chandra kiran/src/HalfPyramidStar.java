import java.util.Scanner;
public class HalfPyramidStar 
{
    public static void main(String[] args) 
    {
        Scanner H= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!H.hasNextInt())
            {
                String input = H.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=H.nextInt();


        }while(n<0);

        int i,j;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=i;j++)
             {
                  System.out.print("* ");
             }
               System.out.println();
         }
         H.close();
    }
    

}

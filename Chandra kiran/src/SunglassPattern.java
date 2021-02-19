import java.util.Scanner;
public class SunglassPattern 
{
    public static void main(String[] args) 
    {
        Scanner D= new Scanner(System.in);
        //input validation..
        int n;
        do{
            System.out.println("enter positive number");
            while(!D.hasNextInt())
            {
                String input = D.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=D.nextInt();


        }while(n<0);

        int i,j,k;
         for(i=0;i<=n-1;i++)//outer for loop
         {
             for(j=0;j<i;j++)//inner for loop
             {
                 System.out.print(" ");//prints space
             }
             for(k=i;k<=n-1;k++)
             {
                 System.out.print("*" +" ");//prints the stars and space
             }
              System.out.println("");
           }
       for(i=n-1;i>=0;i--)//outer for loop
         {
               for(j=0;j<i;j++)//inner for loop
              {
                 System.out.print(" ");//prints space
               }
                for(k=i;k<=n-1;k++)
                {
                    System.out.print("*" +" ");
                }
                System.out.println("");
          }
          D.close();
    
    }
    
}



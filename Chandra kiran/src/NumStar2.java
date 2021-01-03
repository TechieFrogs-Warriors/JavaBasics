import java.util.Scanner;
public class NumStar2 
{
    public static void main(String[] args) 
    {
        Scanner Z=new Scanner(System.in);
        int n;
        do{
            System.out.println("enter positive number");
            while(!Z.hasNextInt())
            {
                String input = Z.next();
   
                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=Z.nextInt();
         }while(n<0);
       int i,j;
        for( i=n;i>=1;i--)
           {
               for(j=1;j<=n;j++)
               {
                   if(j>i)
                   {
                       System.out.print("*");
                   }
               
               else
               {
                   System.out.print(j);
                   
               }
            }
               for( j=n;j>=1;j--)
               {
                   if(j>i)
                   
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
             Z.close();
    }
}
    


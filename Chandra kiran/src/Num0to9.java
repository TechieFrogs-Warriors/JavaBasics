import java.util.Scanner;
public class Num0to9 
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
         System.out.println(0);

         for(i=n;i>=1;i--)
         {
             for(j=i;j<=n;j++)
             {
                 System.out.print(j);
                }
                System.out.print(0);
                for(j=n;j>=i;j--)
                {
                    System.out.print(j);
                }
         System.out.println();
         }
         Z.close();
        
    }
    
}

import java.util.Scanner;
public class ZeroStar 
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
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print("0");
                }
            }
            System.out.print("*");
            for(int j=n;j>=1;j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print("0");
                }
            }
            
            System.out.println();
        } 
        Z.close(); 
     }
    
}

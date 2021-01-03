import java.util.Scanner;
public class AlphaPattern25 
{
    public static void main(String[] args) 
    {
        Scanner D=new Scanner(System.in);
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
         int i,j,t=1,r=1;
         char ch='A';
         for(i=1;i<=n;i++)
         {
             if(i%2==1)
             {
                 for( j=1;j<=i;j++)
                 {
                     System.out.print((char)(t+(ch-1))+" ");
                     t++;
                     }
                }
                    else
                    {
                        int rev=r+t-1;
                       for(j=0;j<i;j++)
                       {
                           System.out.print((char)(rev+(ch-1))+" ");
                           rev--;
                           t++;
                       }
                    }
                System.out.println();
                r++;
         }
        
    }
    
}

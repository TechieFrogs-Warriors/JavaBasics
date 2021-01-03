import java.util.Scanner;
public class AlphaPattern22 
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
           
           for(int i=0;i<=n;i++)
           {
               char Ch='A';
               for(int j=i;j<=n;j++)
               {
                   System.out.print((char) (Ch+j)+" ");
               }
             for(int k=n-1;k>=i;k--) 
              {
                  System.out.print((char)(Ch+k)+" ");
              }
              System.out.println();
             }
              D.close();
     

        
    }
    
}

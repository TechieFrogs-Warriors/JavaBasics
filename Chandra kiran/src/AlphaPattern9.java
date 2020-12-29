import java.util.Scanner;
public class AlphaPattern9 
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
           int alphabet=65;
           for(int i=0;i<=n;i++)
           {
               for(int j=0;j<=i;j++)
               {
                   System.out.print((char)(alphabet+j)+" ");
               }
              System.out.println();
           }
           D.close();
       } 
    }
    
        
    }
    
}

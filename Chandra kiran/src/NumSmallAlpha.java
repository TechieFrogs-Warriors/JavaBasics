import java.util.Scanner;
public class NumSmallAlpha 
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
         int i,j;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print(i);
        
             }
             char ch='`';
          
             for(j=i;j<=n;j++)
             {
                 System.out.print("");
             }
             for(int k=i;k<=n;k++)
             {
                 System.out.print((char) (ch+i));
             }
            
             System.out.println();
         }
           D.close();
    }
    
}

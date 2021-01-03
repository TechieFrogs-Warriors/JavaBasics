import java.util.Scanner;
public class DPattern 
{
    public static void main(String[] args) 
    {
        Scanner D=new Scanner(System.in);
        int n;
         do
         {
             System.out.println("enter positive number");
             while(!D.hasNextInt())
             {
                 String input = D.next();
                 System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
                }
                n=D.nextInt();
            }while(n<0);
            int i,j,temp;
            for(i=1;i<=n;i++)
            { 
                temp=i;
                for(j=1;j<=n;j++)
                {
                    if(j==1|j==n)
                    {
                        System.out.print(temp +" ");
                        
                    }
                    
                    
                
                }
                
            }
            D.close();
        
    }
    
}

import java.util.Scanner;
public class AlphaPattern37 
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
        int temp=0;
        char ch='A';
        for(int i=n;i>=1;i--) 
        {
            
            for(int j=n;j>=i;j--)
            {
             System.out.print((char)(ch + j-1 )+" ");
             temp=j;
            }
            for(int k=n-i+1;k<n;k++)
            {
                System.out.print((char)(ch+ temp -1 )+" ");
                
            }
            System.out.println();
        }
        D.close();
        
    }
    
}

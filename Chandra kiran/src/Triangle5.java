import java.util.Scanner;
public class Triangle5 
{
    public static void main(String[] args) 
    {
        Scanner Z=new Scanner(System.in);
        int n;
         do
         {
             System.out.println("enter positive number");
             while(!Z.hasNextInt())
             {
                 String input = Z.next();
    
                 System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
             }
           n=Z.nextInt();
        }while(n<0);
        int i,k;
        for(i=0;i<=n;i++)
        {
            int j=1;
            System.out.printf("%"  + (n-i) * 2 + "s","");
            for(k=0;k<=i;k++)
            {
                System.out.printf("%4d",j);
                j=j*(i-k)/(i+1);
            }
            System.out.println();

        }
        Z.close();
        
        
    }
    
}

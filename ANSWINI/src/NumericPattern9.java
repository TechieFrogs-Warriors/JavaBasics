import java.util.Scanner;

public class NumericPattern9 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               if(j==1||(j==n &&(i!=1 && i!=n))||((i==1||i==n)&&(j>0&&j<n))) 
               {
                System.out.print(" "+j);
                
               }
                else
                {
                System.out.print("  ");

                }
               /*if(i==1)
               
                
                for(int k=1;k<=3;k++)
                {
                if((j==n &&(i!=1 && i!=n)))
                {
                    j=n+1;
                    System.out.print(" "+j);
                    j++;
                }
                else
                System.out.print("");
            }*/
                

            }
            System.out.println();
            
        }
        obj.close();
        
    }
    
}

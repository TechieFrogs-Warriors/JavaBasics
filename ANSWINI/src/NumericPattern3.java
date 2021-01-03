import java.util.Scanner;

public class NumericPattern3 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                System.out.print("1 ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        obj.close();  
    } 
}

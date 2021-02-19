import java.util.Scanner;

public class NumericPattern7 
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
                if(j==1||j==n||i==j)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        obj.close();
    }
}

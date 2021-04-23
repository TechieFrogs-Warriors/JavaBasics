import java.util.Scanner;

public class NumericPattern8 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int n=obj.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>i)
                System.out.print("*");
                else
                System.out.print(j);
            }
            for(int j=n;j>=1;j--)
            {
                if(j>i)
                System.out.print("*");
                else
                System.out.print(j);
            }
            System.out.println();
        }
        obj.close();
    }
}

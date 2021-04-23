import java.util.Scanner;

public class NumericPattern4 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
        obj.close(); 
    }
}

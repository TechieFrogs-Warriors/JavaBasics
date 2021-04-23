import java.util.Scanner;

public class NumberPattern1 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        obj.close(); 
    }
}

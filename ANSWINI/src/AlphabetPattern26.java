import java.util.Scanner;

public class AlphabetPattern26 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<=n;i++)
        {
            for (int j=i;j<=n; j++)
            {
                System.out.print((char)(ch+j)+ " ");
            }
            for (int k=n-1;k>=i;k--)
            {
                System.out.print((char)(ch+k)+ " ");
            }
            System.out.println();
        }
        obj.close();
    }   
}

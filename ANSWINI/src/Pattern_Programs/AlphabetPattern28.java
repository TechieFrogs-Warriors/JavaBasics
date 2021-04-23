import java.util.Scanner;

public class AlphabetPattern28 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<n-i;j++)
            {
                System.out.print((char)(ch+j));
            }
            for (int k=n-i-2;k>=0;k--)
            {
                System.out.print((char) (ch+k));
            }
            System.out.println();
        }
        obj.close(); 
    }
}

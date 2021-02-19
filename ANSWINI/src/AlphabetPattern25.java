import java.util.Scanner;

public class AlphabetPattern25 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<=n;i++)
        {
            for (int j=n;j>i;j--)
            {
                System.out.print(ch+ " ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print((char)(ch+i)+" ");
            }
            System.out.println();
        }
        obj.close();
    }
}

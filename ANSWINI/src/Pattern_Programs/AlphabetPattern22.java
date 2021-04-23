import java.util.Scanner;

public class AlphabetPattern22 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        int row = 1;
        int count = 1;
        for (int i=1;i<=n;i++)
        {
            if (i%2==0) 
            {
                int reverse=row+count-1;
                for (int j=1;j<=i;j++)
                {
                    System.out.print((char) (reverse+(ch-1))+" ");
                    reverse--;
                    count++;
                }
            }
            else
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print((char)(count+(ch-1))+" ");
                    count++;
                }
            }
            System.out.println();
            row++;
        }
        obj.close(); 
    } 
}

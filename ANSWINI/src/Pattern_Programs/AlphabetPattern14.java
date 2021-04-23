import java.util.Scanner;

public class AlphabetPattern14 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        int temp=(n*(n-1))/2;
        int ch=65;
        for (int i=1;i<n;i++)
        {
            temp = temp - i;
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)(ch + temp + j - 1) + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}

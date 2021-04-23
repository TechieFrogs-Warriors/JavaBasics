import java.util.Scanner;

public class AlphabetPattern30 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if (j%2==0)
                System.out.print((char)(ch+j*n - (j-1)*j/2 + i-j)+ " ");
                else
                System.out.print((char)(ch+j*n - (j-1)*j/2 + n-1-i)+ " ");
            }
            System.out.println();
        }
        obj.close();  
    }  
}

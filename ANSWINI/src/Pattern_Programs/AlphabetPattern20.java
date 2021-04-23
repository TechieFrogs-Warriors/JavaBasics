import java.util.Scanner;

public class AlphabetPattern20 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int n=obj.nextInt();
        for (int i=0;i<=n;i++)
        {
            char ch='A';
            for (int sp=n;sp>i;sp--)
            {
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print((char)(ch+j)+" ");
            }
            for (int k=i-1;k>=0;k--)
            {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
        }
        obj.close();  
    }
    
}

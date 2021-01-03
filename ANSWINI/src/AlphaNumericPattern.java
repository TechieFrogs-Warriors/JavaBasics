import java.util.Scanner;

public class AlphaNumericPattern 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(int k=n;k>=i;k--)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();     
        }
        obj.close(); 
    } 
}

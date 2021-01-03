import java.util.Scanner;

public class AlphabetPattern8mirrorcombination 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        //LOGIC
        for (int i=0;i<=n-1;i++)
        {
            char ch='A';
            for (int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<n;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
        for (int i=n-1;i>=0;i--)
        {
            char ch='A';
            for (int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<n;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();   
        }
        obj.close(); 
    }
    
}

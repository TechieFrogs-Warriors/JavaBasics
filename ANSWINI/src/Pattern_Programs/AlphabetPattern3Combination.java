import java.util.Scanner;

public class AlphabetPattern3Combination 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=n;j>=i;j--)
            {
                System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
            obj.close();
        } 
    }   
}  


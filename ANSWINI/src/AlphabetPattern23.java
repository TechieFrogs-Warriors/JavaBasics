import java.util.Scanner;

public class AlphabetPattern23
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=1;i<=n;i++)
        {
            for (int j=6;j>i;j--)
            {
                System.out.print(" ");
            }
            int temp=1;
            for (int k=1; k<=i;k++)
            {
                System.out.print((char)((ch-1)+temp)+ " ");
                temp=temp*(i-k)/(k);
            }
            System.out.println();
        }
        obj.close();  
    } 
}
